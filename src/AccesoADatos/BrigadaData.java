package AccesoADatos;

import Entidades.*;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BrigadaData {

    private final CuartelData cd = new CuartelData();
    private final Cuartel cuartel = new Cuartel();
    BomberoData bombero = new BomberoData();
    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public boolean GuardarBrigada(Brigada brigada) {
        String checkNombreBrigadaQuery = "SELECT COUNT(*) FROM brigada WHERE nombre_brigada = ?";
        String insertBrigadaQuery = "INSERT INTO brigada (nombre_brigada, especialidad, estado, id_cuartel, disponibilidad, nombre_cuartel) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement checkNombreBrigadaStatement = con.prepareStatement(checkNombreBrigadaQuery)) {
            checkNombreBrigadaStatement.setString(1, brigada.getNombre_brigada());
            ResultSet nombreBrigadaResultSet = checkNombreBrigadaStatement.executeQuery();

            if (nombreBrigadaResultSet.next() && nombreBrigadaResultSet.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Error: El nombre de brigada ya existe en la base de datos.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar el nombre de brigada: " + e.getMessage());
            return false;
        }

        try (PreparedStatement insertBrigadaStatement = con.prepareStatement(insertBrigadaQuery, Statement.RETURN_GENERATED_KEYS)) {
            String nombreCuartel = brigada.getNombre_cuartel();
            CuartelData cuartelData = new CuartelData();
            Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(nombreCuartel);

            if (cuartel != null) {
                brigada.setId_cuartel(cuartel.getId_cuartel());

                insertBrigadaStatement.setString(1, brigada.getNombre_brigada());
                insertBrigadaStatement.setString(2, brigada.getEspecialidad());
                insertBrigadaStatement.setBoolean(3, brigada.isEstado());
                insertBrigadaStatement.setInt(4, brigada.getId_cuartel());
                insertBrigadaStatement.setBoolean(5, brigada.getDisponibilidad() != null && brigada.getDisponibilidad().booleanValue());
                insertBrigadaStatement.setString(6, brigada.getNombre_cuartel());
                insertBrigadaStatement.executeUpdate();

                ResultSet rs = insertBrigadaStatement.getGeneratedKeys();
                if (rs.next()) {
                    brigada.setId_brigada(rs.getInt(1));
                }

                rs.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un Cuartel con este nombre.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada: " + e.getMessage());
            return false;
        }

        return true;
    }

    public Brigada BuscarBrigada(String nombre) {
        Brigada brigada = null;
        String SQL = "SELECT * FROM brigada WHERE nombre_brigada = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            Cuartel cuart;
            if (rs.next()) {
                brigada = new Brigada();
                cuart = new Cuartel();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));
                String nombreCuartel = rs.getString("nombre_cuartel");
                CuartelData cuartelData = new CuartelData();
                Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(nombreCuartel);
                if (cuartel != null) {
                    brigada.setNombre_cuartel(nombreCuartel);
                    //JOptionPane.showMessageDialog(null, "No se encontró un Cuartel con este nombre.");
                }
            } else {
                // JOptionPane.showMessageDialog(null, "No se encontró una Brigada con este nombre.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + e.getMessage());
        }

        return brigada;
    }

    //buscar por id
    public Brigada BuscarBrigadaPorId(int id) {
        Brigada brigada = null;
        String SQL = "SELECT * FROM brigada WHERE id_brigada = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Cuartel cuart;

            if (rs.next()) {
                brigada = new Brigada();
                cuart = new Cuartel();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));

                String nombreCuartel = rs.getString("nombre_cuartel");
                CuartelData cuartelData = new CuartelData();
                Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(nombreCuartel);

                if (cuartel != null) {
                    brigada.setNombre_cuartel(nombreCuartel);

                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una Brigada con este ID.");
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada: " + e.getMessage());
        }

        return brigada;
    }

    public void ModificarBrigada(Brigada brigada) {
        String SQL = " UPDATE brigada "
                + " SET nombre_brigada = ?, especialidad = ?, estado = ?, id_cuartel = ?, disponibilidad =?, nombre_cuartel =?"
                + " WHERE id_brigada = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);

            CuartelData cuartelData = new CuartelData();
            Cuartel cuartel = cuartelData.BuscarCuartelPorNombre(brigada.getNombre_cuartel());

            if (cuartel != null) {
                brigada.setId_cuartel(cuartel.getId_cuartel());

                ps.setString(1, brigada.getNombre_brigada());
                ps.setString(2, brigada.getEspecialidad());
                ps.setBoolean(3, brigada.isEstado());
                ps.setInt(4, brigada.getId_cuartel());
                ps.setBoolean(5, brigada.getDisponibilidad() != null && brigada.getDisponibilidad().booleanValue());
                ps.setString(6, brigada.getNombre_cuartel());
                ps.setInt(7, brigada.getId_brigada());

                int exito = ps.executeUpdate();

                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "La Brigada no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un Cuartel con este nombre.");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + e.getMessage());
        }
    }

    public void EliminarBrigada(int id) {
        try {
            String SQL = "UPDATE brigada SET estado = 0 WHERE id_brigada = ? ";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el Bombero. ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero. " + e.getMessage());
        }
    }

    public List<Brigada> ListarBrigada() {
        List<Brigada> brigadas = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM brigada";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));
                brigada.setId_cuartel(rs.getInt("id_cuartel"));

                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;

    }

    public List<Brigada> ListarBrigadaPorCuartel(int id) {
        List<Brigada> brigadas = new ArrayList<>();

        try {
            String SQL = "SELECT * FROM brigada WHERE id_cuartel = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();

                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));
                brigada.setId_cuartel(rs.getInt("id_cuartel"));

                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;

    }

    public List<Brigada> ListarBrigadasPorNombreCuartel(String nombreCuartel) {

        List<Brigada> brigadas = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM brigada WHERE nombre_cuartel = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, nombreCuartel);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();

                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));

                brigada.setId_cuartel(rs.getInt("id_cuartel"));

                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;

    }

    public List<Brigada> ObtenerBrigadasNODisponibles() {

        ArrayList<Brigada> brigadas = new ArrayList<>();
        String SQL = "SELECT * FROM brigada WHERE disponibilidad = 0";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));

                brigada.setId_cuartel(rs.getInt("id_cuartel"));

                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));

                brigadas.add(brigada);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;

    }

    public List<Brigada> ObtenerBrigadasDisponibles() {

        ArrayList<Brigada> brigadas = new ArrayList<>();
        String SQL = "SELECT * FROM brigada WHERE disponibilidad = 1";
        try {
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigada = new Brigada();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));
                brigada.setId_cuartel(rs.getInt("id_cuartel"));
                brigada.setDisponibilidad(rs.getBoolean("disponibilidad"));
                brigada.setNombre_cuartel(rs.getString("nombre_cuartel"));

                brigadas.add(brigada);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;

    }

    public void AsignarBrigada(Siniestro s1) {
        PreparedStatement ps = null;

        String SQL = "UPDATE siniestro SET id_brigada = ? WHERE id_siniestro = ?";

        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, s1.getBrigada().getId_brigada());
            ps.setInt(2, s1.getCodSiniestro());

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                ps = null;
                SQL = "UPDATE brigada SET disponibilidad = ? WHERE id_brigada =?";

                ps = con.prepareStatement(SQL);
                ps.setBoolean(1, false);
                ps.setInt(2, s1.getBrigada().getId_brigada());
                int resultado2 = ps.executeUpdate();

                if (resultado2 > 0) {
                    JOptionPane.showMessageDialog(null, "Brigada Asignada. ");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + e.getMessage());
//            e.printStackTrace();
        }
    }

    public void liberarBrigada(int cod) {
        String sql = "UPDATE brigada SET estado=? WHERE id_brigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, true);
            ps.setInt(2, cod);

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "La Brigada " + cod + "  ha sido liberada");
            } else {
                JOptionPane.showMessageDialog(null, "Brigada no encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA TABLA BRIGADA\n" + ex.getMessage(), "ERROR CRITICO", 2);
        }
    }
}
