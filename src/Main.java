//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Banco miBanco = new Banco("Banco Tech");

        CuentaBancaria jack = new CuentaBancaria("Jack Agudelo", 500.0);
        CuentaBancaria maria = new CuentaBancaria("Maria Lopez", 200.0);

        miBanco.registrarcuenta(jack);
        miBanco.registrarcuenta(maria);

        System.out.println("\n--- Intentando transferir $150 de Jack a Maria ---");
        miBanco.transferir("Jack Agudelo", "Maria Lopez", 150.0);

        System.out.println("\n--- Saldos finales ---");
        System.out.println("Saldo Jack: $" + jack.getSaldo());   // Debe quedar en 350.0
        System.out.println("Saldo Maria: $" + maria.getSaldo()); // Debe quedar en 350.0


    }
}