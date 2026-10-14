//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Banco miBanco = new Banco("Banco Tech");

        CuentaBancaria cuenta1 = new CuentaBancaria("Jack Agudelo", 500.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 1200.0);
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos Ruiz", 300.0);

        miBanco.registrarcuenta(cuenta1);
        miBanco.registrarcuenta(cuenta2);
        miBanco.registrarcuenta(cuenta3);

        // Prueba 1: Buscar una cuenta que está al final (Carlos)
        System.out.println("\n--- Buscando a Carlos ---");
        CuentaBancaria encontrada = miBanco.buscarCuentaPorTitular("Carlos Ruiz");
        if (encontrada != null) {
            System.out.println("Cuenta encontrada con éxito. Saldo: $" + encontrada.getSaldo());
        }

        // Prueba 2: Buscar una cuenta que no existe
        System.out.println("\n--- Buscando a alguien que no existe ---");
        CuentaBancaria noExiste = miBanco.buscarCuentaPorTitular("Andres Gomez");




    }
}