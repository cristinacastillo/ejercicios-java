/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author crcs
 */
public class Vehiculo {
    
    private static int vehiculosCreados;
    static int kmTotales;
    private int kmRecorridos;
    private String marca;
    private String modelo;

    public Vehiculo(int kmRecorridos, String marca, String modelo) {
        this.kmRecorridos = kmRecorridos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKmTotales() {
        return kmTotales;
    }

    public static void setKmTotales(int kmTotales) {
        Vehiculo.kmTotales = kmTotales;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
