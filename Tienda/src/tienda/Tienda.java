/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author AL-Alumno
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("papitas");
        productos.add("galleta chocolate");
        productos.add("galleta vainilla");
        productos.add("coca cola");
        productos.add("pan");
        
        System.out.println("Productos:" + productos);
        
        productos.set(1, "galleta oreo");
        System.out.println(productos.size());
        
        if (productos.contains("pan")) {
            productos.remove("pan");
        } else {
            System.out.println("El producto no existe");
        }
        
        System.out.println("Posicion de galleta oreo: " + productos.indexOf("galleta oreo"));
        
        for (String n : productos) {
            System.out.println(productos.indexOf(n) + ". " + n);
        }
    }
    
}
