/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minilibreriaapp;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author AL-Alumno
 */
public class MiniLibreriaApp {
    public static void main(String[] args) {
        ArrayList<Libro> lib = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        
        // array max = 3
        
        while (true) {
            boolean salir = false;
            
            System.out.println("=== MINILIBRERÍA ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Vender ejemplares");
            System.out.println("4. Salir");

            /*
            Registrar libro: 
            pedir ID, título, precio y stock. Si el array está lleno, mostrar un aviso. 
            No aceptar IDs repetidos.
            
            Mostrar libros: mostrar únicamente los libros registrados. 
            Si todavía no hay libros, informar que el inventario está vacío.
            
            Vender ejemplares: pedir el ID del libro y la cantidad. 
            Buscar el libro por su ID y comprobar que existe, que la cantidad es mayor que cero y que hay stock suficiente. 
            Si todo es válido, descontar las unidades y mostrar el total a pagar. Una venta rechazada debe conservar el stock original.
            */
            
            System.out.println("Ingresa tu opcion: ");
            int opc = inp.nextInt();
            
            switch (opc) {
                case 1:
                    if (lib.size() >= 3) {
                        System.out.println("La libreria esta llena.");
                        break;
                    }
                    
                    System.out.println("Ingresa el ID del libro: ");
                    int ID = inp.nextInt();
                    
                    if (lib.get(ID) != null) {
                        System.out.println("La ID ingresada ya fue registrada.");
                        break;
                    }
                    
                    System.out.println("Ingresa el titulo del libro: ");
                    String titulo = inp.nextLine();
                    
                    System.out.println("Ingresa el precio del libro: ");
                    double precio = inp.nextDouble();
                    
                    System.out.println("Ingresa el stock del libro: ");
                    int stock = inp.nextInt();
                    
                    Libro nuevoLibro = new Libro(ID, titulo, precio, stock);
                    lib.add(ID, nuevoLibro);
                    
                    break;
                case 2:
                    if (lib.size() == 0) {
                        System.out.println("El inventario se encuentra vacio.");
                        break;
                    }
                    
                    System.out.println("Libros registrados actualmente: ");
                    for (Libro l : lib) {
                        System.out.println(l);
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingresa el ID del libro a comprar: ");
                    int ID = inp.nextInt();
                    
                    Libro libroAcomprar = lib.get(ID);
                    
                    if (libroAcomprar == null) {
                        System.out.println("La ID ingresada no esta registrada.");
                        break;
                    }
                    
                    System.out.println("Ingresa la cantidad a comprar: ");
                    int cantidad = inp.nextInt();
                    
                    if (cantidad > 0 && libroAcomprar.getStock() <= cantidad) {
                        
                        
                    } else {
                        System.out.println("La cantidad ingresada es invalida o supera el stock actual del libro.");
                    }
                    
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa..");
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
