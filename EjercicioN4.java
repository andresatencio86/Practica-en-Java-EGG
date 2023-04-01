/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.n4;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
   //La fórmula correspondiente es: F = 32 + (9 * C / 5).
   
 Scanner leer = new Scanner (System.in);
 
    
    
    
   System.out.println("ingrese la temperatura en grados C y se la daremos en F ");
   double grados = leer.nextDouble();
 
   double F = 32 + (9*grados/5);
    
    System.out.println("la temperatura en F es " + F);   
    
    }
    
}
