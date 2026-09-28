/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author AL-Alumno
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSeg;

    public Cancion() {
    }
    
    public Cancion(String t, String a, int d) {
        this.titulo = t;
        this.artista = a;
        this.duracionSeg = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }
    
    public boolean esLarga() {
        return (this.duracionSeg > 240);
    }
    
    public String duracionFormato() {
        int minutos = this.duracionSeg / 60;
        int segundos = this.duracionSeg - (minutos * 60);
        
        return minutos + ":" + segundos;
    }
    
    public void mostrar() {
        String textoLongitud = "corta";
        if (this.esLarga()) {
            textoLongitud = "larga";
        }
        
        System.out.println(this.getTitulo() + " - " + this.getArtista() + " (" + this.duracionFormato() + ") [" + textoLongitud + "]");
    }
}
