/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minilibreriaapp;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author AL-Alumno
 */
public class MiniLibreriaApp {
    public static void main(String[] args) {
        ArrayList<Libro> lib = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        
        while (true) {
            boolean salir = false;
            
            System.out.println("=== MINILIBRERÍA ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Vender ejemplares");
            System.out.println("4. Salir");
            
            System.out.println("Ingresa tu opcion: ");
            int opc = inp.nextInt();
            
            switch (opc) {
                case 1:
                    if (lib.size() >= 3) {
                        System.out.println("La libreria esta llena (máximo 3 libros).");
                        break;
                    }
                    
                    System.out.println("Ingresa el ID del libro: ");
                    int idIngresado = inp.nextInt();
                    
                    boolean idExiste = false;
                    for (Libro l : lib) {
                        if (l.getId() == idIngresado) {
                            idExiste = true;
                            break;
                        }
                    }
                    
                    if (idExiste) {
                        System.out.println("La ID ingresada ya fue registrada.");
                        break;
                    }
                    
                    inp.nextLine();
                    System.out.println("Ingresa el titulo del libro: ");
                    String titulo = inp.nextLine();
                    
                    System.out.println("Ingresa el precio del libro: ");
                    double precio = inp.nextDouble();
                    
                    System.out.println("Ingresa el stock del libro: ");
                    int stock = inp.nextInt();
                    
                    Libro nuevoLibro = new Libro(idIngresado, titulo, precio, stock);
                    lib.add(nuevoLibro);
                    System.out.println("Libro registrado");
                    
                    break;
                    
                case 2:
                    if (lib.isEmpty()) {
                        System.out.println("El inventario se encuentra vacio.");
                        break;
                    }
                    
                    System.out.println("Libros registrados actualmente: ");
                    for (Libro l : lib) {
                        System.out.println(l);
                    }
                    
                    break;
                    
                case 3:
                    if (lib.isEmpty()) {
                        System.out.println("No hay libros registrados para vender.");
                        break;
                    }
                    
                    System.out.println("Ingresa el ID del libro a comprar: ");
                    int idCompra = inp.nextInt();
                    
                    Libro libroAcomprar = null;
                    for (Libro l : lib) {
                        if (l.getId() == idCompra) {
                            libroAcomprar = l;
                            break;
                        }
                    }
                    
                    if (libroAcomprar == null) {
                        System.out.println("La ID ingresada no esta registrada.");
                        break;
                    }
                    
                    System.out.println("Ingresa la cantidad a comprar: ");
                    int cantidad = inp.nextInt();
                    
                    if (cantidad > 0 && libroAcomprar.getStock() >= cantidad) {
                        libroAcomprar.setStock(libroAcomprar.getStock() - cantidad);
                        
                        double totalPagar = cantidad * libroAcomprar.getPrecio();
                        System.out.println("Venta exitosa. El total a pagar es: $" + totalPagar);
                    } else {
                        System.out.println("Venta rechazada. La cantidad es inválida o supera el stock actual (Stock disponible: " + libroAcomprar.getStock() + ").");
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
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