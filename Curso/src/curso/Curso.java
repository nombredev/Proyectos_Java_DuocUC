/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
public class Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();
        
        System.out.println("Cuantos estudiantes se registraran?: ");
        int cantidad = sc.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingresa el nombre para el estudiante " + i + ": ");
            String n = sc.nextLine();
            if (!n.isEmpty() && !estudiantes.contains(n)) {
                estudiantes.add(n);
            } else {
                System.out.println(n + " ya fue ingresado o no es un nombre valido.");
            }
        }
        
        System.out.println("============");
        System.out.println("Estudiantes:" + estudiantes);
        
        while (true) {
            boolean salir = false;
            
            System.out.println("=== Opciones ===");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Ver");
            System.out.println("4. Salir");
            
            System.out.println("Ingresa tu opcion: ");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: // agregar
                    System.out.println("Ingresa el nombre para el estudiante: ");
                    String na = sc.nextLine();
                    if (!na.isEmpty() && !estudiantes.contains(na)) {
                        estudiantes.add(na);
                    } else {
                        System.out.println(na + " ya fue ingresado o no es un nombre valido.");
                    }
                    break;
                case 2: // eliminar
                    System.out.println("Ingresa el nombre para el estudiante a borrar: ");
                    String nr = sc.nextLine();
                    if (estudiantes.contains(nr)) {
                        estudiantes.remove(nr);
                    } else {
                        System.out.println(nr + " no es un estudiante valido");
                    }
                    break;
                case 3: // ver
                    System.out.println("Estudiantes:" + estudiantes);
                    break;
                case 4: // salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
            if (salir) {
                break;
            }
        }
        
        
    }
}
