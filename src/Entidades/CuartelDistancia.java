
package Entidades;

/**
 
 * @author Julian Rios
 */
public class CuartelDistancia {
    
    private int idCuartel;
    private double distancia;

    public CuartelDistancia(int idCuartel, double distancia) {
        this.idCuartel = idCuartel;
        this.distancia = distancia;
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

   

    @Override
    public String toString() {
        return "Cuartel ID: " + idCuartel + ", Distancia: " + distancia;
    }

}
