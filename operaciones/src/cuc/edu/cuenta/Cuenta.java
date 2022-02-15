package cuc.edu.cuenta;

public class Cuenta {
    protected int id;
    protected double saldoCuenta;
    protected String titularCuenta;

    public Cuenta(int id, String titularCuenta) {
        this.id = id;
        this.titularCuenta = titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public int getId() {
        return id;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", saldoCuenta=" + saldoCuenta + ", titularCuenta=" + titularCuenta + '}';
    }
    
    public void consignar(double nuevoValor) {
        if(nuevoValor > 0){
            this.saldoCuenta += nuevoValor;
        }
    }
    
    public boolean retirar(double valorRetiro) {
        if(valorRetiro > 0 && valorRetiro <= this.saldoCuenta){
            this.saldoCuenta -= valorRetiro;
            return true;
        }else {
            return false;
        }
    }
    
    public boolean transferir(Cuenta cuentaADestino, double montoATransferir) {
        if (this.retirar(montoATransferir)) {
            cuentaADestino.consignar(montoATransferir);
            return true;
        }else{
            return false;
        }
    }
}
