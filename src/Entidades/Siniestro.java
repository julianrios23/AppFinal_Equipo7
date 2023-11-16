
package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Siniestro {
    
    private int codSiniestro;
    private Especialidad tipo;
    private LocalDate fechaSinietro;
    private String hora;
    private double coord_X;
    private double coord_Y;
    private String detalles;
    private LocalDate fechaResoluc;
    private String horaResoluc;
    private int puntuacion;
    private Brigada Brigada;

    public Siniestro() {
    }

    public Siniestro(Especialidad tipo, LocalDate fechaSinietro, String hora, double coord_X, double coord_Y, String detalles, LocalDate fechaResoluc, String horaResoluc, int puntuacion, Brigada Brigada) {
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.hora = hora;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.horaResoluc = horaResoluc;
        this.puntuacion = puntuacion;
        this.Brigada = Brigada;
    }

    public Siniestro(int codSiniestro, Especialidad tipo, LocalDate fechaSinietro, String hora, double coord_X, double coord_Y, String detalles, LocalDate fechaResoluc, String horaResoluc, int puntuacion, Brigada Brigada) {
        this.codSiniestro = codSiniestro;
        this.tipo = tipo;
        this.fechaSinietro = fechaSinietro;
        this.hora = hora;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fechaResoluc = fechaResoluc;
        this.horaResoluc = horaResoluc;
        this.puntuacion = puntuacion;
        this.Brigada = Brigada;
    }

    public int getCodSiniestro() {
        return codSiniestro;
    }

    public void setCodSiniestro(int codSiniestro) {
        this.codSiniestro = codSiniestro;
    }

    public Especialidad getTipo() {
        return tipo;
    }

    public void setTipo(Especialidad tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSinietro() {
        return fechaSinietro;
    }

    public void setFechaSinietro(LocalDate fechaSinietro) {
        this.fechaSinietro = fechaSinietro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResoluc() {
        return fechaResoluc;
    }

    public void setFechaResoluc(LocalDate fechaResoluc) {
        this.fechaResoluc = fechaResoluc;
    }

    public String getHoraResoluc() {
        return horaResoluc;
    }

    public void setHoraResoluc(String horaResoluc) {
        this.horaResoluc = horaResoluc;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return Brigada;
    }

    public void setBrigada(Brigada Brigada) {
        this.Brigada = Brigada;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codSiniestro=" + codSiniestro + ", tipo=" + tipo 
                + ", fechaSinietro=" + fechaSinietro + ", hora=" + hora 
                + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", detalles=" 
                + detalles + ", fechaResoluc=" + fechaResoluc + ", horaResoluc=" 
                + horaResoluc + ", puntuacion=" + puntuacion + ", Brigada=" + Brigada + '}';
    }

    
}
