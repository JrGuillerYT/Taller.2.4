package Objectos;

public class Cuenta {

    // esta es la superclase CLASE DE LA QUE SE HEREDA
    // Definir los atributos
    protected String titular; // Nombre titular de la cuenta
    protected double saldo;  // Cantidad de dinero en la cuenta
    protected int numTransaciones; // Numero de transaciones
    protected double comisionMensual; // Comision mensual

    // Crear Constructor de la Cuenta
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numTransaciones = 0;
        this.comisionMensual = 0.0;
    }
    

    // Definir Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad <= saldo) { // Solo retirar si hay suficiente dinero
            saldo -= cantidad;
            numTransaciones++;
        } else {
            System.out.println("Saldo insuficiente = $ "); // no hay suficiente dinero
        }
    }

    // Definir metodo para consignar dinero
    public void consignar(double cantidad) {
        saldo += cantidad;
        numTransaciones++;
        System.out.println("Consignacion exitosa = $" + cantidad);
    }

    // Definir Método para mostrar el saldo actual 
    public void mostrarSaldo() {
        System.out.println("Saldo = $ " + saldo);
    }

    // Definir metodo para mostrar la comision mensual
    public void mostrarComision() {
        System.out.println("Comision mensual = $" + comisionMensual);
    }

    // Definir metodo para mostrar el numero de transaciones
    public void mostrarNumTransaciones() {
        System.out.println("Numero de transaciones = $" + numTransaciones);
    }

}
