package Entidades;

/**
 *
 * @author Julian Rios
 */
public class Brigada {

    private int id_brigada;
    private String nombre_brigada;
    private String especialidad;
    private boolean estado;
    private int id_cuartel;
    private Boolean disponibilidad;
    private String nombre_cuartel;
    private Cuartel cuartel;

    public Brigada() {
    }

    public Brigada(String nombre_brigada, String especialidad, boolean estado, int id_cuartel, Boolean disponibilidad, String nombre_cuartel, Cuartel cuartel) {
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.id_cuartel = id_cuartel;
        this.disponibilidad = disponibilidad;
        this.nombre_cuartel = nombre_cuartel;
        this.cuartel = cuartel;
    }

    public Brigada(int id_brigada, String nombre_brigada, String especialidad, boolean estado, int id_cuartel, Boolean disponibilidad, String nombre_cuartel, Cuartel cuartel) {
        this.id_brigada = id_brigada;
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.id_cuartel = id_cuartel;
        this.disponibilidad = disponibilidad;
        this.nombre_cuartel = nombre_cuartel;
        this.cuartel = cuartel;
    }

    

    public int getId_brigada() {
        return id_brigada;
    }

    public void setId_brigada(int id_brigada) {
        this.id_brigada = id_brigada;
    }

    public String getNombre_brigada() {
        return nombre_brigada;
    }

    public void setNombre_brigada(String nombre_brigada) {
        this.nombre_brigada = nombre_brigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_cuartel() {
        return id_cuartel;
    }

    public void setId_cuartel(int id_cuartel) {
        this.id_cuartel = id_cuartel;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNombre_cuartel() {
        return nombre_cuartel;
    }

    public void setNombre_cuartel(String nombre_cuartel) {
        this.nombre_cuartel = nombre_cuartel;
    }

    public void asignarCuartel(Cuartel cuartel) {
        this.id_cuartel = cuartel.getId_cuartel();
        this.nombre_cuartel = cuartel.getNombre_cuartel();
    }

    public String getNombreCuartel() {
        return this.nombre_cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }
    
    

    public Object[] toArray() {
        return new Object[]{id_brigada, nombre_brigada, especialidad, estado, nombre_cuartel, disponibilidad};
    }

    public Cuartel getCuartel() {
        return this.cuartel;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad != null && this.disponibilidad;
    }

    @Override
    public String toString() {
        return "Brigada{" + "id_brigada=" + id_brigada + ", nombre_brigada=" + nombre_brigada + ", especialidad=" + especialidad + ", estado=" + estado + ", id_cuartel=" + id_cuartel + ", disponibilidad=" + disponibilidad + ", nombre_cuartel=" + nombre_cuartel + '}';
    }

}
