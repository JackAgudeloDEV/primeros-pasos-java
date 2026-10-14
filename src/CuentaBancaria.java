public class CuentaBancaria {
    // 1. Atributos privados
    private String titular;
    private double  saldo;

    // Constructor
    public CuentaBancaria( String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // Metodo depositar
    public void depositar (double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Deposito exitoso, su nuevo saldo es de> $"+this.saldo);
        }else {
            System.out.println("El monto a depositor debe ser mnayor a cero");
        }
    }

    // metodo para retirar
                public void retirar (double monto){

                    if (monto <= 0){
                        System.out.println("El monto a retirar debe ser mayor de cero ");
                    }else if (monto > this.saldo){
                        System.out.println("Fondos insuficientes. Tu saldo actual es: $"+ this.saldo);
                    }else {
                        this.saldo -= monto;
                        System.out.println("Retiro exitoso de $"+monto+" Saldo restante: $"+ this.saldo);
                    }
                }

                // getter para consultar los datos


    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
