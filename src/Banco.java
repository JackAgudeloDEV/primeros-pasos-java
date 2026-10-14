import java.util.ArrayList;
import java.util.List;


public class Banco {
    private String nombre;
    //listo que solo almacena objetos de tipo cuentaBancaria
    private List<CuentaBancaria> cuentas;

    public Banco (String nombre){
        this.nombre=nombre;
        this.cuentas = new ArrayList<>(); // iniciar la lista vacia
    }

    // Metodo para agregar cuentas a  la lista

    public void registrarcuenta(CuentaBancaria cuenta){
        this.cuentas.add(cuenta);
        System.out.println("cuenta de "+cuenta.getTitular()+" registrada con exito en: "+ this.nombre);
    }

    // metodo para mostrar todas las cuentas registradas en la lista

    public void ListarCuentas (){
        System.out.println("\n--- Listado de cuentas en "+this.nombre+" ---");
        for(CuentaBancaria cuenta: this.cuentas){
            System.out.println("Titular: "+cuenta.getTitular() + "| saldo> $"+cuenta.getSaldo());
        }
    }

    public CuentaBancaria buscarCuentaPorTitular(String nombreBuscado){

        for (CuentaBancaria cuenta: this.cuentas){
            if (cuenta.getTitular().equalsIgnoreCase(nombreBuscado)){
                return cuenta;
            }
        }
        System.out.println("El nombre: "+nombreBuscado+" no esta asociado a una cuenta registrada");
        return  null;
    }


        public void transferir(String titularOrigen, String titularDestino, double monto){
                CuentaBancaria origen =buscarCuentaPorTitular(titularOrigen);
                CuentaBancaria destino =buscarCuentaPorTitular(titularDestino);



            if ( origen == null ){
                System.out.println("La cuenta de origen: "+titularOrigen+" no se encuentra registrada en el banco");
                return;
            }

            if ( destino == null){
                System.out.println("La cuenta de destino: "+titularDestino+" no se encuentra registrada en el banco");
                return;
            }

            if (monto <= 0){
                System.out.println("El monto ingresado debe ser mayor a cero");
                return;
            }

            if (origen.getSaldo() < 0){
                System.out.println("Saldo insuficiente ");
                return;
            }

            origen.retirar(monto);
            destino.depositar(monto);
            System.out.println("transferencia exitosa de: "+monto+" el nuevo saldo de la cuenta "+destino.getTitular()+" es de "+destino.getSaldo());
        }








}
