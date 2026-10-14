import java.util.ArrayList;
import java.util.List;


public class Banco {
    private String nombre;
    //listo que solo almacena objetos de tipo cuentaBancaria
    private List<CuentaBancaria> cuentas;

    // constructor
    public Banco (String nombre){
        this.nombre=nombre;
        this.cuentas = new ArrayList<>(); // iniciar la lista vacia
    }

    // Metodo para agregar cuentas a  la lista

    public void registrarcuenta(CuentaBancaria cuenta){
        this.cuentas.add(cuenta);
        System.out.println("La cuenta de "+cuenta.getTitular()+" registrada con exito en: "+ this.nombre);
    }

    // metodo para mostrar todas las cuentas registradas en la lista

    public void ListarCuentas (){
        System.out.println("\n--- Listado de cuentas en "+this.nombre+" ---");
        for(CuentaBancaria cuenta: this.cuentas){
            System.out.println("Titular: "+cuenta.getTitular() + "| saldo> $"+cuenta.getSaldo());
        }
    }
        // metodo para buscar cuenta por titular
    public CuentaBancaria buscarCuentaPorTitular(String nombreBuscado){
        for (CuentaBancaria cuenta: this.cuentas){
            if (cuenta.getTitular().equalsIgnoreCase(nombreBuscado)){
                return cuenta;
            }
        }
        throw new CuentaNoEncontradaExcepetion("no existe un cuenta registrada a nombre de: "+nombreBuscado);
    }

        // metodo para transferir dinero de una cuenta a otra
    public void transferir(String titularOrigen, String titularDestino, double monto){

        if (monto <= 0){
           throw new IllegalArgumentException("El monto a transferir debe de ser mayor a cero");
        }

        CuentaBancaria origen =buscarCuentaPorTitular(titularOrigen);
        CuentaBancaria destino =buscarCuentaPorTitular(titularDestino);

        origen.retirar(monto);
        destino.depositar(monto);
        System.out.println("transferencia exitosa de: "+monto+" el nuevo saldo de la cuenta "+destino.getTitular()+" es de "+destino.getSaldo());
        }








}
