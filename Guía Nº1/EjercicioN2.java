/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.n2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    Scanner leer = new Scanner (System.in);
    System.out.println("ingresa tu nombre");
    String nombre;
    nombre = leer.next();
    System.out.println("tu nombre es " + nombre);

    }

    }
