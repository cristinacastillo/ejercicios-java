/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY.ejercicio03;

/**
 *
 * @author crcs
 */
public class Disco {

    private String codigo;
    private String autor;
    private String tiutlo;
    private String genero;
    private int duracion;

    
    public Disco() {
        this.codigo = "LIBRE";
    }
   

    public Disco(String autor, String tiutlo, String genero, int duracion) {
        this.autor = autor;
        this.tiutlo = tiutlo;
        this.genero = genero;
        this.duracion = duracion;
        this.codigo = "ESCRITO";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.tiutlo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }

}
