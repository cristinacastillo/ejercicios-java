/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control05plus;

/**
 *
 * @author Cristina Castillo Obregon
 */
public class Cuenta {

    public Cuenta(int numCuenta, float saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    private int numCuenta;
    
    private float saldo;

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    /*metodo para consultar saldo*/
    float consultarSaldo(){
        
        return this.saldo;
    }
    
    /*añadir abonos*/
    float abonos(float incremento){
        
        this.saldo = this.saldo + incremento;
        
        return this.saldo;
    }
    
    
    /*quitar dinero para cobrar recibos*/
    float recibos(float decremento){
        
        this.saldo = this.saldo - decremento;
        
        return this.saldo;
    }
    
    
   //float transferencias(){
        
        
    //}


}



