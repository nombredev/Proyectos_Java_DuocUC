/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author AL-Alumno
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Juan");
        System.out.println("Lista: " + nombres);
        System.out.println("Primero: " + nombres.get(0));
        
        nombres.set(1, "Carlos"); // Pedro -> Carlos
        System.out.println("Modificada: " + nombres);
        
        nombres.remove("Maria");
        System.out.println("Sin Maria: " + nombres);
        
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
        System.out.println("Cantidad: " + nombres.size());
    }
    
}
