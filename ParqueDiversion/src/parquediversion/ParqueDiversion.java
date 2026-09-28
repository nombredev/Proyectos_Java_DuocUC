/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquediversion;

/**
 *
 * @author AL-Alumno
 */
public class ParqueDiversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego montaniaRusa = new Juego("Montaña Rusa", "3 min", 1.60, 12);
        Juego carrusel = new Juego("Carrusel", "2 min", 1.20, 8);
        Juego tren = new Juego("Tren", "5 min", 1.40, 10);
        
        montaniaRusa.mostrarInfo();
        carrusel.mostrarInfo();
        tren.mostrarInfo();
        
        System.out.println("Niño de 10 años puede subirse al carrusel? " + carrusel.puedeSubir(10));
        
    }
    
}
