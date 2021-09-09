
package javaapplication1;


public class Publicacion {
    protected String titulo;
    protected int añoPubli;
    protected float precioPubli;

    public Publicacion(String titulo, int añoPubli, float precioPubli) {
        this.titulo = titulo;
        this.añoPubli = añoPubli;
        this.precioPubli = precioPubli;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    public float getPrecioPubli() {
        return precioPubli;
    }

    public void setPrecioPubli(float precioPubli) {
        this.precioPubli = precioPubli;
    }
    
    
}
