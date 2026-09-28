/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public class Gato extends Animal {
    private String especie;
    
    public Gato(String nombre, int edad, String especie) {
        super(nombre, edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("miau");
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("====Informacion de Gato====");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Especie: " + this.getEspecie());
    }
}
