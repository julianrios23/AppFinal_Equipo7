package Entidades;

import java.time.LocalDate;
import java.util.Vector;

/**
 *
 * @author Julian Rios
 */
public class Bombero {

    private int id_bombero;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha_nacimiento;
    private String grupo_sanguineo;
    private Brigada brigada;
    private String celular;
    private boolean estado;
    private String chapa_iden;

    public Bombero() {
    }

    public Bombero(int id_bombero, String nombre, String apellido, int dni, LocalDate fecha_nacimiento, String grupo_sanguineo, Brigada brigada, String celular, boolean estado, String chapa_iden) {
        this.id_bombero = id_bombero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.brigada = brigada;
        this.celular = celular;
        this.estado = estado;
        this.chapa_iden = chapa_iden;
        this.brigada = new Brigada();
    }

    public Bombero(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, String grupo_sanguineo, Brigada brigada, String celular, boolean estado, String chapa_iden) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.brigada = brigada;
        this.celular = celular;
        this.estado = estado;
        this.chapa_iden = chapa_iden;
        this.brigada = new Brigada();
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getChapa_iden() {
        return chapa_iden;
    }

    public void setChapa_iden(String chapa_iden) {
        this.chapa_iden = chapa_iden;
    }


    @Override
    public String toString() {
        return "Bombero{" + "id_bombero=" + id_bombero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha_nacimiento=" + fecha_nacimiento + ", grupo_sanguineo=" + grupo_sanguineo + ", brigada=" + brigada + ", celular=" + celular + ", estado=" + estado + ", chapa_iden=" + chapa_iden + '}';
    }

    public Object[] toArray() {
        return new Object[]{id_bombero, nombre, apellido, dni, fecha_nacimiento, grupo_sanguineo, brigada  , celular, estado, chapa_iden};
    }
    
   public void setNombreBrigada(String nombreBrigada) {
        this.brigada.setNombre_brigada(nombreBrigada);
    }
   
   

}
