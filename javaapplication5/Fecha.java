/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Alumno
 */
public Fecha{

    private int mes;
    private int dia;
    private int año;
    
    public laFecha(int mes,int dia, int año){
        this.mes=mes;
        this.dia=dia;
        this.año=año;
    }
    public void setMes(int mes1){
        this.mes=mes1;
       
    }
    public int getMes(){
        return mes;
    }
    public void setDia(int dia1){
        this.dia=dia1;

    }
    public int getDia(){
        return dia;
    }
    public void setAño(int año1){
        this.año= año1;
  
    }
    public int getAño(getAño){
        return año;
    }
    public void mostrarFecha(){
        System.out.print(getDia()"/"+ getMes() "/" + getAño());
    }
   

}
