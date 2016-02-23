/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;
public class Persona {

    private String nombre;
    private int edad;
    
    public void inicializar(){
        /*Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = lector.next();
        System.out.println("Ingrese Edad");
        edad = lector.nextInt();*/
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    public void esMayorEdad(){
        if (edad>=18)
            System.out.println("Es mayor de edad");
        else 
            System.out.println("Es menor de edad");
        
    }
    
   
    
    }
    

