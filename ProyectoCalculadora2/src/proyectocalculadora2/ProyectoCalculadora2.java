/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocalculadora2;

import java.util.Scanner;

/**
 *
 * @author AL-Alumno
 */
class Calculadora {

    public double Sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double Restar(double num1, double num2) {
        return num1 - num2;
    }

    public double Multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double Dividir(double num1, double num2) {
        double resultado = 0;

        try {
            resultado = num1 / num2;
        } catch (Exception e) {
            System.out.println("Error: Se intento dividir por 0");
        }

        return resultado;
    }
}

public class ProyectoCalculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        double num1;
        double num2;
        double resultado;
        int opcion;

        System.out.println("=====CALCULADORA=====");

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.println("Seleccione una operacion: ");
        System.out.println("1: Sumar");
        System.out.println("2: Resar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                resultado = calc.Sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calc.Restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calc.Multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = calc.Dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("operacion no valida");
        }
    }

}
