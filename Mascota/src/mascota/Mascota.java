/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascota;
import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
public class Mascota {
    private String nombre;
    private int energia;
    private int hambre;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 100;
        this.hambre = 0;
    }
    
    public void comer() {
        int disminucion = 30;
        if (this.hambre - disminucion < 0) {
            this.hambre = 0;
        } else {
            this.hambre -= 30;
        }
    }
    
    public void jugar() {
        if (this.energia - 20 < 0) { 
            this.energia = 0;
        } else {
            this.energia -= 20;
        }
        this.hambre += 15;
    }
    
    public void dormir() {
        this.energia = 100;
    }
    
    public boolean estaFeliz() {
        return (this.energia > 50 && this.hambre < 50);
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Energia: " + this.energia);
        System.out.println("Hambre: " + this.hambre);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la mascota: ");
        String nombre = sc.nextLine();
        
        Mascota mascota = new Mascota(nombre);
        
        // jugar 3 veces
        mascota.jugar();
        mascota.jugar();
        mascota.jugar();
        
        mascota.estaFeliz();
        
        // se debe llamar comer()las veces que sea suficiente para mantenerlo feliz
        mascota.comer();
        
        
    }
    
}
