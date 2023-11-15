
package Entidades;

import java.text.DecimalFormat;

/**
 
 * @author Julian Rios
 */
public class Cuartel {
    
     private int id_cuartel;
    private String nombre_cuartel;
    private String direccion;
    private Double coord_X;
    private Double coord_Y;
    private String telefono;
    private String correo;
    private Boolean estado;

    public Cuartel() {
    }

    public Cuartel(int id_cuartel, String nombre_cuartel, String direccion, Double coord_X, Double coord_Y, String telefono, String correo, Boolean estado) {
        this.id_cuartel = id_cuartel;
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public Cuartel(String nombre_cuartel, String direccion, Double coord_X, Double coord_Y, String telefono, String correo, Boolean estado) {
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public int getId_cuartel() {
        return id_cuartel;
    }

    public void setId_cuartel(int id_cuartel) {
        this.id_cuartel = id_cuartel;
    }

    public String getNombre_cuartel() {
        return nombre_cuartel;
    }

    public void setNombre_cuartel(String nombre_cuartel) {
        this.nombre_cuartel = nombre_cuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(Double coord_X) {
        this.coord_X = coord_X;
    }

    public Double getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(Double coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        return " ID: " + id_cuartel
                + ", Cuartel: " + nombre_cuartel
                + ", Telefono: " + telefono
                + ", Direccion: " + direccion
                + ", Coordenadas X: " + coord_X
                + ", Coordenadas Y: " + coord_Y
                + ", Correo: " + correo
                + ", Estado: " + estado;
    }

}
