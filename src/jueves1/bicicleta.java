
package jueves1;

public class bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;

    public bicicleta(String nroDeSerie, String modelo, float precio,int año) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.precio = precio;
        this.año = año;
    }

    bicicleta() {
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "nroDeSerie=" + nroDeSerie + ", modelo=" + modelo + ", año= " + año + ", precio=" + precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
