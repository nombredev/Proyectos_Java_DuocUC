/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroeysumochila;

/**
 *
 * @author AL-Alumno
 */
public class HeroeYsuMochila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe h = new Heroe("armando");
        
        h.mostrarEstado();
        
        h.agregarItem("bebida");
        h.agregarItem("pocion");
        h.agregarItem("comida");
        
        h.recibirDanio(50);
        
        h.mostrarEstado();
        
        h.usarItem("pocion");
        h.usarItem("comida");
        
        h.mostrarEstado();
        
    }
    
}
