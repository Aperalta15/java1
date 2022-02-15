/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuc.edu.cuenta;

/**
 *
 * @author invitado
 */
public class CuentaAhorros extends Cuenta {
    protected double interesCuenta = 0.05;

    public CuentaAhorros(int id, String titularCuenta) {
        super(id, titularCuenta);
    }

    public double getInteresCuenta() {
        return interesCuenta;
    }

    public void setInteresCuenta(double interesCuenta) {
        this.interesCuenta = interesCuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" + "interesCuenta=" + interesCuenta + '}';
    }

    @Override
    public boolean retirar(double valorRetiro) {
        double montoARetirarComision = valorRetiro + (valorRetiro * 0.10);
        return super.retirar(valorRetiro); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
