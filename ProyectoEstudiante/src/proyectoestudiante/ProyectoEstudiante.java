/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoestudiante;

import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
class Estudiante {
    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

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

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
    }
    
    public void verificarEdad() {
        if (edad >= 18) {
            System.out.println("El estudiante es mayor de edad");
        } else {
            System.out.println("El estudiante es menor de edad");    
        }
    }
    
    public void mostrarNacimiento() {
        int year = 2026 - this.getEdad();
        System.out.println("Año de de nacimiento del estudiante: " + year);
    }
    
    public void modificarEdad(int nuevaEdad) {
        this.setEdad(nuevaEdad);
    }
}

public class ProyectoEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa nombre del estudiante: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingresa la edad del estudiante: ");
        int edad = entrada.nextInt();
        
        System.out.println("Ingresa la nota 1 del estudiante: ");
        double nota1 = entrada.nextInt();
        
        System.out.println("Ingresa la nota 2 del estudiante: ");
        double nota2 = entrada.nextInt();
        
        System.out.println("Ingresa la nota 3 del estudiante: ");
        double nota3 = entrada.nextInt();
        
        Estudiante est = new Estudiante(nombre, edad, nota1, nota2, nota3);
        
        System.out.println("Estudiante creado: ");
        
        est.mostrarDatos();
        est.verificarEdad();
        est.mostrarNacimiento();
        
    }
    
}
