
package javaapplication1;


public class Disco extends Publicacion{
    private float duracion;
    private int cantidad;

    public Disco(String titulo,int añoPubli,float duracion, float precioPubli, int cantidad ) {
        super(titulo, añoPubli, precioPubli);
        this.duracion = duracion;
        this.cantidad = cantidad;
    }

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

   
    
        
}