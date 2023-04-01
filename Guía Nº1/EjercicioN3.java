/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.n3;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.

   Scanner leer = new Scanner (System.in);
   String frase;
   System.out.println("Ingrese una frase y la mostraremos en minuscula");
   frase= leer.nextLine();
   System.out.println("la frase es " + frase);
   
   String frase2 = frase.toUpperCase();
   String frase3 = frase.toLowerCase();
   System.out.println("La frase en matusculas es " + frase2);
   System.out.println("La frase en matusculas es " + frase3);
    
   
  
   
   
   
    
    
    
    }
    
}
