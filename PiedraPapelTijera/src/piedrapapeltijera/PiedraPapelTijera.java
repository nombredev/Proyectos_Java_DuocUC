/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijera;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author AL-Alumno
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otra;
        
        do {
            System.out.println("1 Piedra, 2 Papel, 3 Tijera: ");
            int yo = sc.nextInt();
            int pc = (int) (Math.random() * 3) + 1;
            
            switch (pc) {
                case 1:
                    System.out.println("PC: Piedra");
                    break;
                case 2:
                    System.out.println("PC: Papel");
                    break;
                case 3:
                    System.out.println("PC: Tijera");
                    break;
            }
            
            if (yo == pc) {
                System.out.println("¡Empate!");
            } else if (todo) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("Gana el PC");
            }
            
            System.out.println("¿Otra? (1/2)");
            otra = sc.nextInt();
        } while (otra == 1);
        
    }
    
}
