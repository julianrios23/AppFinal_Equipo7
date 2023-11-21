package AccesoADatos;

import Entidades.Brigada;
import Entidades.Especialidad;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
    }

    public int guardarSiniestro(Siniestro sin) {

        int codSiniestro = 0;

        String sql = "INSERT INTO siniestro (tipo, fechaSiniestro, horaSiniestro, coord_X, coord_Y, detalles, id_brigada)"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, sin.getTipo().name());  // Corregido: índice 1 en lugar de 2
            ps.setDate(2, java.sql.Date.valueOf(sin.getFechaSinietro()));
            ps.setString(3, sin.getHora());
            ps.setDouble(4, sin.getCoord_X());
            ps.setDouble(5, sin.getCoord_Y());
            ps.setString(6, sin.getDetalles());
            ps.setInt(7, sin.getBrigada().getId_brigada());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                sin.setCodSiniestro(rs.getInt(1));
                codSiniestro = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Incidente cargado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro: " + ex.getMessage());
            // Opcional: Imprimir información adicional sobre la excepción
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("Error Code: " + ex.getErrorCode());
        }// catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro !!");
//        }

        return codSiniestro;

    }

    public void concluirSiniestro(Siniestro sin) {
        String sql = "UPDATE siniestro SET fechaResoluc=?, horaResoluc=?, puntuacion=? "
                + "WHERE cod_siniestro=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(sin.getFechaResoluc()));
            ps.setString(2, sin.getHoraResoluc());
            ps.setInt(3, sin.getPuntuacion());
            ps.setInt(4, sin.getCodSiniestro());
            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                //JOptionPane.showMessageDialog(null, "Siniestro concluido exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo concluir el siniestro. No se encontró el siniestro con el código proporcionado.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro: " + ex.getMessage());
        }
    }

    public ArrayList<String[]> listarCuarteslesXEsp(String especialidad) {
        ArrayList<String[]> DatosXEsp = new ArrayList<>();

        String sql = "SELECT b.id_brigada, b.nombre_brigada, c.nombre_cuartel, c.id_cuartel FROM brigada b JOIN cuartel c "
                + "ON (b.id_cuartel = c.id_cuartel) WHERE especialidad = ? AND b.disponibilidad = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] datos = new String[4];
                datos[0] = rs.getInt("codBrigada") + "";
                datos[1] = rs.getString("nombreBrig");
                datos[2] = rs.getString("nombreCuartel");
                datos[3] = rs.getInt("codCuartel") + "";
                DatosXEsp.add(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay Cuarteles que cumplan los requisitos", "ERROR !!", 2);
        }

        return DatosXEsp;
    }

    public Siniestro buscarSiniestro(int cod) {
        Siniestro sin = null;
        Brigada brig = null;
        String sql = "SELECT * FROM siniestro WHERE cod_siniestro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(cod);
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSiniestro");
                LocalDate localDate = LocalDate.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                sin.setFechaSinietro(localDate);

                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setHoraResoluc(rs.getString("horaResoluc"));
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setId_brigada(rs.getInt("id_brigada"));
                sin.setBrigada(brig);
            } else {
                JOptionPane.showMessageDialog(null, "No hay Reportes con el código " + cod);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Siniestros\n" + ex, "ERROR CRITICO !!", 2);
//            System.out.println("Error: " + ex);
            sin = null;
        }

        return sin;
    }

    public ArrayList<Siniestro> listarSiniestros() {
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin;
        Brigada brig;
        String sql = "SELECT * FROM siniestro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSiniestro");
                LocalDateTime localDateTime = LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                sin.setFechaSinietro(localDateTime.toLocalDate());
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setHoraResoluc(rs.getString("horaResoluc"));

                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setId_brigada(rs.getInt("id_brigada"));
                sin.setBrigada(brig);

                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay Reportes en la tabla Siniestros", "ERROR !!", 2);
//            System.out.println("Error: " + ex);
        }
        return listaSin;
    }

    public ArrayList<Siniestro> listarSiniestrosXFecha(LocalDate fecha, LocalDate localFechaSeleccionada1) {
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin;
        Brigada brig;
        String sql = "SELECT * FROM siniestro WHERE fechaSiniestro = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSiniestro");
                LocalDateTime localDateTime = LocalDateTime.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                sin.setFechaSinietro(localDateTime.toLocalDate());
                sin.setHora(rs.getString("horaSiniestro"));
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setHoraResoluc(rs.getString("horaResoluc"));

                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setId_brigada(rs.getInt("id_brigada"));
                sin.setBrigada(brig);

                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta: " + ex.getMessage(), "ERROR !!", JOptionPane.ERROR_MESSAGE);
        }

        return listaSin;
    }

    //nuevo
    public ArrayList<Siniestro> listarTodosLosSiniestros() {
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin;
        Brigada brig;

        String sql = "SELECT s.*, b.nombre_brigada "
                + "FROM siniestro s "
                + "JOIN brigada b ON s.id_brigada = b.id_brigada";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();

                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSiniestro");
                LocalDate localDate = LocalDate.parse(datetimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                sin.setFechaSinietro(localDate);
                sin.setHora(rs.getString("horaSiniestro"));
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));

                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }

                sin.setHoraResoluc(rs.getString("horaResoluc"));
                sin.setPuntuacion(rs.getInt("puntuacion"));

                brig.setId_brigada(rs.getInt("id_brigada"));
                brig.setNombre_brigada(rs.getString("nombre_brigada"));

                sin.setBrigada(brig);

                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los siniestros", "ERROR !!", 2);
        }

        return listaSin;
    }

    public ArrayList<Siniestro> listarUltimas48Horas() {
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin;
        Brigada brig;

        LocalDateTime ahora = LocalDateTime.now();

        // Calculo la fecha hace 48 horas
        LocalDateTime hace48Horas = ahora.minusHours(48);

        String sql = "SELECT s.*, b.nombre_brigada "
                + "FROM siniestro s "
                + "JOIN brigada b ON s.id_brigada = b.id_brigada "
                + "WHERE s.fechaSiniestro BETWEEN ? AND ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, hace48Horas);
            ps.setObject(2, ahora);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String dateString = rs.getString("fechaSiniestro");
                LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                sin.setFechaSinietro(localDate);
                sin.setHora(rs.getString("horaSiniestro"));
                sin.setCoord_X(rs.getDouble("coord_X"));
                sin.setCoord_Y(rs.getDouble("coord_Y"));
                sin.setDetalles(rs.getString("detalles"));
                Date aux = rs.getDate("fechaResoluc");
                if (aux == null) {
                    sin.setFechaResoluc(null);
                } else {
                    sin.setFechaResoluc(aux.toLocalDate());
                }
                sin.setHoraResoluc(rs.getString("horaResoluc"));
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setId_brigada(rs.getInt("id_brigada"));
                brig.setNombre_brigada(rs.getString("nombre_brigada"));

                sin.setBrigada(brig);

                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los siniestros de las últimas 48 horas", "ERROR !!", 2);
        }

        return listaSin;
    }

}
