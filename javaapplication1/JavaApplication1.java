/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disco _disco =new Disco("Señor de los AAAAAA",2004, (float) 60.4,30,6);
        Libro _libro=new Libro("Señor de los AAAAAA",2004, (float) 60.4,6,"SONY");
        
 
        System.out.print("TITULO: " +_disco.getTitulo() +"Publicado el: " + _disco.getAñoPubli() +"Precio: " + _disco.getPrecioPubli() + "Duracion: "+ _disco.getDuracion() + "Cantidad de temas: " + _disco.getCantidad() );
         System.out.print("TITULO: " +_libro.getTitulo() +"Publicado el: " + _libro.getAñoPubli() +"Precio: " + _libro.getPrecioPubli() +  "PAGINAS: " + _libro.getNumPag() + "EDITORIAL: "+ _libro.getEditorial());     
    }
    
}
