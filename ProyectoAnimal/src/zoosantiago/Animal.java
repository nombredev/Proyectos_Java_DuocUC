/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosantiago;

/**
 *
 * @author AL-Alumno
 */
public abstract class Animal {
    // Encapsulamiento
    private String nombre;
    private int edad;

    // Constructor con parametros
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Métodos
    public abstract void hacerSonido();
    
    public abstract void mostrarInformacion();
}
