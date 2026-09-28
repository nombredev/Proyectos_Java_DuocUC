/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parquediversion;

/**
 *
 * @author AL-Alumno
 */
public class Juego {
    private String nombre;
    private String duracion;
    
    private double alturaMinima;
    private int edadMinima;

    public Juego(String nombre, String duracion, double alturaMinima, int edadMinima) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    
    public void mostrarInfo() {
        System.out.println(this.nombre + " | " + "Edad min: " + this.edadMinima + " | " + this.duracion);
    }
    
    public boolean puedeSubir(int edad) {
        return (edad >= this.edadMinima);
    }
    
}
