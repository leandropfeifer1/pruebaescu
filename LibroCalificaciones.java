package calificaciones;

import java.util.Scanner;
public class LibroCalificaciones{
    private String NombreProfe;  //nueva variable
    private String nombreDelCurso;
    public LibroCalificaciones(String NombreProfe, String nombreDelCurso){
        	


        this.NombreProfe=NombreProfe;

        this.nombreDelCurso=nombreDelCurso;
        
        
    }
    public String getNombreProfe() {
        return NombreProfe;
    }

    public void setNombreProfe(String NombreProfe) {
        this.NombreProfe = NombreProfe;
    }
    
    public LibroCalificaciones(String nombre){
	nombreDelCurso=nombre;
    }
    public void setNombreDelCurso(String nombre){
	nombreDelCurso=nombre;
    }
    public String getNombreDelCurso(){
	return nombreDelCurso;
    }
    public void mostrarMensaje(){
	System.out.printf ("Bienvenido al libro de calificaciones para \n %s!\n", getNombreDelCurso());
	System.out.printf ("Este Curso esta dictado por el/la Profesor/a  \n %s!\n", getNombreProfe());
        
    }
    public void determinarPromedioClase(){
	Scanner entrada=new Scanner(System.in);
	int total=0;
	int contadorCalif;
	int calificacion;
	for(contadorCalif=1;contadorCalif<=10; contadorCalif++){
            
            System.out.printf("Escriba la calificación");
            calificacion=entrada.nextInt();
            total=total+calificacion;	
	}
	System.out.printf("\nEl promedio de clases es %.2f\n", total/10.00);
    }
}// PruebaLibroCalificaciones.java

