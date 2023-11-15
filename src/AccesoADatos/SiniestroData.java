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
import javax.swing.JOptionPane;

public class SiniestroData {

    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
    }

    public int guardarSiniestro(Siniestro sin) {
        int codSiniestro = 0;

        String sql = "INSERT INTO siniestro (tipo, fechaSinietro, horaSiniestro, coord_X, coord_Y, detalles, id_brigada)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, sin.getTipo().name());
            ps.setObject(2, sin.getFechaSinietro());
            ps.setDouble(3, sin.getCoord_X());
            ps.setDouble(4, sin.getCoord_Y());
            ps.setString(5, sin.getDetalles());
            ps.setInt(6, sin.getBrigada().getId_brigada());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                sin.setCodSiniestro(rs.getInt("insert_id"));
                codSiniestro = rs.getInt("insert_id");
                JOptionPane.showMessageDialog(null, "Incidente cargado correctamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!");
        }

        return codSiniestro;
    }

    public void concluirSiniestro(Siniestro sin) {
        String sql = "UPDATE siniestro SET fechaResoluc=?,puntuacion=? "
                + "WHERE cod_siniestro=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(sin.getFechaResoluc()));
            ps.setInt(2, sin.getPuntuacion());
            ps.setInt(3, sin.getCodSiniestro());

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "Reporte actualizado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero !!");
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
                String datetimeString = rs.getString("fechaSinietro");
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
                String datetimeString = rs.getString("fechaSinietro");
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

    public ArrayList<Siniestro> listarSiniestrosXFecha(LocalDate fecha1, LocalDate fecha2) {
        ArrayList<Siniestro> listaSin = new ArrayList<>();
        Siniestro sin;
        Brigada brig;
        String sql = "SELECT * FROM siniestro WHERE fechaSinietro BETWEEN ? AND ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, fecha1);
            ps.setObject(2, fecha2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sin = new Siniestro();
                brig = new Brigada();
                sin.setCodSiniestro(rs.getInt("cod_siniestro"));
                sin.setTipo(Especialidad.valueOf(rs.getString("tipo")));
                String datetimeString = rs.getString("fechaSinietro");
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
                sin.setPuntuacion(rs.getInt("puntuacion"));
                brig.setId_brigada(rs.getInt("id_brigada"));
                sin.setBrigada(brig);

                listaSin.add(sin);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay Reportes en la tabla Siniestros para las fechas seleccionadas", "ERROR !!", 2);
//            System.out.println("Error: " + ex);
        }

        return listaSin;
    }

}
