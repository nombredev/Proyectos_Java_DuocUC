/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duelodeheroes;

/**
 *
 * @author AL-Alumno
 */
public class DueloDeHeroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe a = new Heroe("Valkiria", 100, 18);
        Heroe b = new Heroe("Golem", 130, 12);
        
        while (a.estaVivo() && b.estaVivo()) {
            a.atacar(b);
            if (b.estaVivo()) {
                b.atacar(a);
            }
        }
        
        if (a.estaVivo()) {
            System.out.println("Gana: " + a.getNombre());
        } else if (b.estaVivo()) {
            System.out.println("Gana: " + b.getNombre());
        }
        
    }
    
}
