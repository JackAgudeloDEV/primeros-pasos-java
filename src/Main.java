//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Banco miBanco = new Banco("Banco Tech");

        CuentaBancaria jack = new CuentaBancaria("Jack Agudelo", 200.0);
        miBanco.registrarcuenta(jack);

        // Caso 1: Intentar transferir a alguien que no existe
        try {
            System.out.println("--- Prueba 1: Cuenta inexistente ---");
            miBanco.transferir("Jack Agudelo", "Persona Ficticia", 50.0);
        } catch (CuentaNoEncontradaExcepetion e) {
            System.out.println("[ERROR 404] " + e.getMessage());
        } catch (SaldoInsuficieinteException e) {
            System.out.println("[ERROR 400] " + e.getMessage());
        }

        // Caso 2: Fondos insuficientes
        CuentaBancaria maria = new CuentaBancaria("Maria Lopez", 100.0);
        miBanco.registrarcuenta(maria);

        try {
            System.out.println("\n--- Prueba 2: Saldo insuficiente ---");
            miBanco.transferir("Jack Agudelo", "Maria Lopez", 1000.0);
        } catch (CuentaNoEncontradaExcepetion e) {
            System.out.println("[ERROR 404] " + e.getMessage());
        } catch (SaldoInsuficieinteException e) {
            System.out.println("[ERROR 400] " + e.getMessage());
        }
    }
}