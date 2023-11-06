
package Entidades;

import java.time.LocalDate;

/**
 
 * @author Julian Rios
 */
public class Siniestro {
    
    private int id_siniestro;
    private double coord_X;
    private double coord_Y;
    private LocalDate fecha_siniestro;
    private String hora_siniestro;
    private String tipo;
    private String detalles;
    private Brigada brigada;
    private LocalDate fecha_resolucion;
    private String hora_fin_siniestro;
    private int calificacion;
    private Boolean estado;

    public Siniestro() {
    }

    public Siniestro(double coord_X, double coord_Y, LocalDate fecha_siniestro, String hora_siniestro, String tipo, String detalles, Brigada brigada, LocalDate fecha_resolucion, String hora_fin_siniestro, int calificacion, Boolean estado) {
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.hora_siniestro = hora_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.hora_fin_siniestro = hora_fin_siniestro;
        this.calificacion = calificacion;
        this.estado = estado;
    }

    public Siniestro(int id_siniestro, double coord_X, double coord_Y, LocalDate fecha_siniestro, String hora_siniestro, String tipo, String detalles, Brigada brigada, LocalDate fecha_resolucion, String hora_fin_siniestro, int calificacion, Boolean estado) {
        this.id_siniestro = id_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.hora_siniestro = hora_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.hora_fin_siniestro = hora_fin_siniestro;
        this.calificacion = calificacion;
        this.estado = estado;
    }

    public int getId_siniestro() {
        return id_siniestro;
    }

    public void setId_siniestro(int id_siniestro) {
        this.id_siniestro = id_siniestro;
    }

    public double getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(double coord_X) {
        this.coord_X = coord_X;
    }

    public double getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(double coord_Y) {
        this.coord_Y = coord_Y;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public String getHora_siniestro() {
        return hora_siniestro;
    }

    public void setHora_siniestro(String hora_siniestro) {
        this.hora_siniestro = hora_siniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public LocalDate getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(LocalDate fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public String getHora_fin_siniestro() {
        return hora_fin_siniestro;
    }

    public void setHora_fin_siniestro(String hora_fin_siniestro) {
        this.hora_fin_siniestro = hora_fin_siniestro;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        return " ID" + id_siniestro
                + ", Coordenadas X " + coord_X
                + ", Coordenadas Y " + coord_Y
                + ", Fecha Del Siniestro " + fecha_siniestro
                + ", Tipo " + tipo 
                + ", Detalles " + detalles
                + ", Brigada" + brigada
                + ", Fecha Resolucion " + fecha_resolucion
                + ", Calificacion " + calificacion
                + ", Estado " + estado;
    }

    public boolean isEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
