package AccesoADatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public void GuardarBombero(Bombero bombero) {
        String SQL = "INSERT INTO bombero (nombre, apellido, dni, fecha_nacimiento, grupo_sanguineo,brigada , celular, estado, chapa_iden) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setInt(3, bombero.getDni());
            ps.setDate(4, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(5, bombero.getGrupo_sanguineo());
            ps.setInt(6, bombero.getBrigada().getId_brigada());
            ps.setString(7, bombero.getCelular());
            ps.setBoolean(8, bombero.isEstado());
            ps.setString(9, bombero.getChapa_iden());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                bombero.setId_bombero(rs.getInt(1));

            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a Acceder a la tabla Bombero" + e.getMessage());
        }
    }

    public Bombero BuscarBombero(int id) {
        Bombero bombero = null;
        String SQL = "SELECT * FROM bombero WHERE id_bombero=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Brigada brg;
            if (rs.next()) {
                bombero = new Bombero();
                brg = new Brigada();
                bombero.setId_bombero(id);
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brg.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brg);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setChapa_iden(rs.getNString("chapa_iden"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + e.getMessage());
        }
        return bombero;
    }

    public void ModificarBombero(Bombero bombero) {

        String SQL = " UPDATE bombero "
                + "SET nombre = ?, apellido =?, fecha_nacimiento = ?, grupo_sanguineo = ?, id_brigada = ?, celular = ?, estado = ?, chapa_iden = ? "
                + "WHERE dni = ?";//LO CAMBIE AL ULTIMO DATO POR DNI NO ID_BOMBERO
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);

            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(4, bombero.getGrupo_sanguineo());
            ps.setInt(5, bombero.getBrigada().getId_brigada());
            ps.setString(6, bombero.getCelular());
            ps.setBoolean(7, bombero.isEstado());
            ps.setString(8, bombero.getChapa_iden());
            ps.setInt(9, bombero.getDni());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + e.getMessage());
        }
    }

    public void EliminarBombero(String dni) {
        try {
            String SQL = "UPDATE bombero SET estado = 0 WHERE dni = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se marcó el bombero como inactivo.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con este DNI.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + e.getMessage());
        }
    }

    public Bombero BuscarBomberoPorIdent(String chapaId) {
        Bombero bombero = null;
        String SQL = "SELECT * FROM bombero WHERE chapa_iden = ?";
        try (PreparedStatement ps = con.prepareStatement(SQL)) {
            ps.setString(1, chapaId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    bombero = new Bombero();
                    bombero.setDni(rs.getInt("chapa_iden"));
                    bombero.setId_bombero(rs.getInt("id_bombero"));
                    bombero.setNombre(rs.getString("nombre"));
                    bombero.setApellido(rs.getString("apellido"));
                    bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                    bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));

                    Brigada brg = new Brigada();
                    brg.setId_brigada(rs.getInt("id_brigada"));
                    bombero.setBrigada(brg);

                    bombero.setCelular(rs.getString("celular"));
                    bombero.setEstado(rs.getBoolean("estado"));
                    bombero.setChapa_iden(rs.getString("chapa_iden"));
                } else {
                    // JOptionPane.showMessageDialog(null, "No se encontró un bombero con este DNI.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex);
        }
        return bombero;
    }
    
    public Bombero BuscarBomberoPorDni(String dni) {
        Bombero bombero = null;
        String SQL = "SELECT * FROM bombero WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            Brigada brg;
            if (rs.next()) {
                bombero = new Bombero();
                brg = new Brigada();
                bombero.setDni(rs.getInt("dni"));
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setBrigada(brg);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setChapa_iden(rs.getString("chapa_iden"));
            } else {
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex);
         ex.printStackTrace();
        }
        
        return bombero;
    }

    public List<Bombero> ListarBomberos() {
        List<Bombero> bomberos = new ArrayList<>();

        try {
            String SQL = "SELECT * FROM bombero";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                Brigada brigada = new Brigada();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brigada);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(true);
                bombero.setChapa_iden(rs.getNString("chapa_iden"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        }
        return bomberos;
    }

    public List<Bombero> ListarBomberosPorBrigada(int id) {
        List<Bombero> bomberos = new ArrayList<>();

        try {

            String SQL = "SELECT * FROM bombero WHERE id_brigada = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                Brigada brigada = new Brigada();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brigada);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(true);
                bombero.setChapa_iden(rs.getNString("chapa_iden"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        }
        return bomberos;
    }

    public List<Bombero> ListarBomberosPorCuartel(String nombreCuartel) {
        List<Bombero> bomberos = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM bombero b JOIN brigada br ON b.brigada = br.id_brigada JOIN"
                    + " cuartel c ON br.id_cuartel = c.id_cuartel WHERE c.nombre_cuartel = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, nombreCuartel);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bombero bombero = new Bombero();
                Brigada brigada = new Brigada();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brigada);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(true);
                bombero.setChapa_iden(rs.getString("chapa_iden"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        }
        return bomberos;
    }
}
