
package LIBRO;


public class Disco extends Publicacion{
    private float duracion;
    private int cantidad;

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Disco(String titulo, int añoPubli, float precioPubli,float duracion,int cantidad) {
        super(titulo, añoPubli, precioPubli);
    }
        
}