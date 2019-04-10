/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control05plus;

import java.util.ArrayList;

/**
 *
 * @author Criistina Castillo Obregon
 */
public class Persona {
    
    private String DNI;

    ArrayList<Cuenta> CuentasBancarias = new ArrayList<Cuenta>();

        
    public Persona(String DNI,  ArrayList<Cuenta> CuentasBancarias) {
        this.DNI = DNI;
        this.CuentasBancarias = CuentasBancarias;
    }

   

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Cuenta> getCuentasBancarias() {
        return CuentasBancarias;
    }

    public void setCuentasBancarias(ArrayList<Cuenta> CuentasBancarias) {
        this.CuentasBancarias = CuentasBancarias;
    }
    
    
    
     @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", CuentasBancarias=" + CuentasBancarias + '}';
    }
    
    /*crea una nueva cuenta dentro del el array de cuentas*/
    void anadirCuenta(){
        
        CuentasBancarias.add(new Cuenta(0, 0));
        
    }
    
    /*recorro el array de cuentas para cuando haya alguna con la cantidad<0 el boleano morosa sea true*/
    boolean morosa(){
        
        boolean morosa = false;
        
        for (Cuenta e : CuentasBancarias){
            
            if(e.getSaldo() < 0){
                
                morosa = true;
            }
            
        }
        
       return morosa;
    }
    
    
}
