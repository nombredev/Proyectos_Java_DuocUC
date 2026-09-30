/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author AL-Alumno
 */
public class CuentaBancaria {
    private double saldo;
    
    private double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }
}
