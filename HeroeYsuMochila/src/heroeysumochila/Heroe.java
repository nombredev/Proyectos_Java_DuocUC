/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroeysumochila;

import java.util.ArrayList;

/**
 *
 * @author AL-Alumno
 */
public class Heroe {
    private String nombre;
    private int vida = 100;
    private ArrayList<String> mochila = new ArrayList<>();

    public Heroe(String nombre) { this.nombre = nombre; }
    
    public int getVida() { return vida; }
    
    public void recibirDanio(int d) { // vida nunca < 0
        if (this.vida - d < 0) {
            this.vida = 0; // no baja de 0
        } else {
            this.vida -= d;
        }
        System.out.println("- El heroe fue dañado. Nueva vida: " + this.vida);
    }
    
    public void curar(int c) { // vida nunca > 100
        if (this.vida + c > 100) {
            this.vida = 100; // nunca pasa de 0
        } else {
            this.vida += c;
        }
        System.out.println("- El heroe fue curado. Nueva vida: " + this.vida);
    }
    
    public boolean agregarItem(String item) { // max 5
        if (mochila.size() > 4) {
            System.out.println("- La mochila esta llena");
            return false;
        }
        
        mochila.add(item);
        
        System.out.println("- Se agrego el item " + item);
        
        return true;
    }
    
    public void usarItem(String item) { // pocion cura 30
        if (!mochila.contains(item)) {
            System.out.println("El heroe no cuenta con ese item.");
            return;
        }
        
        mochila.remove(item);
        if (item == "pocion" && this.vida > 0) {
            this.curar(30);
        }
        
        System.out.println("- Se uso el item " + item);
    }
    
    public void mostrarEstado() { // nombre, vida, mochila
        System.out.println("=== Estado del heroe ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mochila: " + this.mochila);
    }
}
