/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duelodeheroes;

import java.lang.Math;

/**
 *
 * @author AL-Alumno
 */
public class Heroe {
    private String nombre;
    
    private int vida;
    private int ataque;

    public Heroe(String n, int v, int a) {
        this.nombre = n;
        this.vida = v;
        this.ataque = a;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    // metodos
    public void atacar(Heroe rival) {
        boolean esCritico = (Math.random() > 0.5);
        int danio = this.getAtaque();
        if (esCritico) { 
            danio *= 1.5;
            System.out.println("golpe critico");
        }
        
        if (rival.getVida() - danio < 0) {
            rival.setVida(0);
        } else {
            rival.setVida(rival.getVida() - danio);
        }
    }
    
    public boolean estaVivo() {
        return (this.getVida() > 0);
    }
}
