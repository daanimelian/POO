public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Se depositaron $" + monto);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

