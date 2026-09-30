/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author AL-Alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();
        
        c.depositar(5000);
        c.saldo = 1000000; // atributo privado
        System.out.println(cuenta.getSaldo()); // getSaldo es privado
        cuenta.setSaldo(99); // método inexistente
    }
    
}
