/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendavideojuego;

import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
public class TiendaVideojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        if (edad < 18) {
            System.out.println("No se puede continuar si eres menor de edad.");
        } else {
            boolean activo = true;
            
            int precioJuego1 = 29990;
            int precioJuego2 = 39990;
            int precioJuego3 = 24990;
                    
            do {
                System.out.println("Edad: " + edad);

                System.out.println("=== GAME STORE ===");
                System.out.println("1. Aventura Galáctica $29.990");
                System.out.println("2. Fútbol Pro $39.990");
                System.out.println("3. Carreras Extremas $24.990");
                System.out.println("0. Salir");

                System.out.println("Ingresa tu opcion: ");
                int opcion = sc.nextInt();

                if (opcion == 0) {
                    System.out.println("Saliste de la tienda");
                    break;
                }
                
                if (opcion <= 0 && opcion > 3) {
                    System.out.println("Opcion invalida. Ingresa una opcion valida.");
                    continue;
                }

                System.out.println("Ingresa la cantidad a comprar: ");
                int cantidad = sc.nextInt();

                if (cantidad <= 0) {
                    System.out.println("Cantidad invalida. Ingresa un numero mayor a 0");
                    continue;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Compraste x" + cantidad + " Aventura Galáctica!");
                        System.out.println("Subtotal: " + (precioJuego1 * cantidad));
                        break;
                    case 2:
                        System.out.println("Compraste x" + cantidad + " Fútbol Pro!");
                        System.out.println("Subtotal: " + (precioJuego2 * cantidad));
                        break;
                    case 3:
                        System.out.println("Compraste x" + cantidad + " Carreras Extremas!");
                        System.out.println("Subtotal: " + (precioJuego3 * cantidad));
                        break;
                    case 0:
                        break;
                }

                System.out.println("¿Deseas realizar otra compra? 1. Si / 0. No");
                int eleccion = sc.nextInt();
                
                if (eleccion == 0) {
                    break;
                }
            } while (activo);
        }
    }

}
