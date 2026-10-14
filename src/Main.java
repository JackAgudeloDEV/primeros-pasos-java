//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
      CuentaBascaria miCuenta = new CuentaBascaria(100.0, "Jack Agudelo");

        System.out.println("Titular: "+miCuenta.getTitular());
        System.out.println("Saldo: "+miCuenta.getSaldo());

        miCuenta.depositar(50.0);
        miCuenta.retirar(30.0);
        miCuenta.retirar(200.0);
        miCuenta.retirar(-10.0);






    }
}