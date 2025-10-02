package entidades;

public class CuentaBancaria {
   private double montoTransaccion;
   private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto){
        if (saldo > 0){
            saldo += monto;
        }
        return saldo;
    }
    public double retirar(double monto){
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
        return saldo;
    }

    public void setMontoTransaccion(double montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMontoTransaccion() {
        return montoTransaccion;
    }

    public double getSaldo() {
        return saldo;
    }
}
