/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.n5;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjercicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
    //el triple y la raíz cuadrada de ese número. 

   Scanner leer = new Scanner (System.in);
 
    
    
    
   System.out.println("ingrese un numero entero y le daremos el valor doble, triple y la raiz cuadrada");
   int numero = leer.nextInt();
   int numero2 = numero*2;
   int numero3 = numero * numero * numero;
   double numero4 = Math.sqrt(numero); 
 
   
    
    System.out.println("el doble del numero es " + numero2);   
     System.out.println("el triple del numero es " + numero3);  
     System.out.println("la raiz cuadrada del numero es " + numero4);  
    
    }
    
}
