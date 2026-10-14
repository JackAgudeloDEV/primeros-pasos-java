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








}
