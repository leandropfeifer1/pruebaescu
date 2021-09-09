
package LIBRO;


public class Libro extends Publicacion{

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
        private int numPag;
        private String editorial;
        
    public Libro(String titulo, int añoPubli, float precioPubli,int numPag,String editorial) {
        super(titulo, añoPubli, precioPubli);
            
     } 
        
}  