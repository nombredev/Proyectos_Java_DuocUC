/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playlist;

/**
 *
 * @author AL-Alumno
 */
public class Playlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Night's Blood", "Dissection", 402);
        Cancion c2 = new Cancion("Frame by Frame", "King Crimson", 308);
        Cancion c3 = new Cancion("Perennial Quest", "Death", 501);
        
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
        
        c1.setDuracionSeg(10);
        
        c1.mostrar();
        
    }
    
}
