/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class ZooSantiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("firulais", 4, "pastor");
        Animal perro2 = new Perro("max", 3, "labrador");
        
        Animal gato1 = new Gato("pelusa", 2, "angora");
        Animal gato2 = new Gato("fresa", 3, "siamesa");
        
        Animal pato1 = new Pato("lukas", 2, "negro");
        Animal pato2 = new Pato("donald", 5, "blanco");
        
        System.out.println("=====INFORMACION DE ANIMALES=====");
        perro1.mostrarInformacion();
        perro2.mostrarInformacion();
        
        System.out.println();
        gato1.mostrarInformacion();
        gato2.mostrarInformacion();
        
        System.out.println();
        pato1.mostrarInformacion();
        pato2.mostrarInformacion();
        
        System.out.println("=====SONIDO DE ANIMALES=====");
        perro1.hacerSonido();
        gato1.hacerSonido();
        pato1.hacerSonido();
    }
    
}
