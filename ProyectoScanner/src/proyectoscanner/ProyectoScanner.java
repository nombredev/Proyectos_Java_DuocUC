/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoscanner;

/**
 *
 * @author AL-Alumno
 */

import java.util.Scanner;
public class ProyectoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Bienvenido " + nombre + " de edad " + edad);
        
    }
    
}
