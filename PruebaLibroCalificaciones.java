
package calificaciones;
import calificaciones.LibroCalificaciones;
import java.util.Scanner;

public class PruebaLibroCalificaciones {
    public static void main(String args[]){
        LibroCalificaciones miLibro=new LibroCalificaciones("Introducción a la Programación en Java");
        miLibro.setNombreProfe("Patricia Centeno");
        miLibro.setNombreDelCurso("Segundo Año De Analistas");
	miLibro.mostrarMensaje();
	miLibro.determinarPromedioClase();
    }
}

    

