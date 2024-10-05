package Objectos;

// Esta es la clase subclase HEREDA DE OTRA CLASE
public class CuentaAhorros extends Cuenta {

    private double tasaInteres; // Tasa de interes a la cuenta de ahorros

    // Constructor de la subclase CuentaAhorros
    public CuentaAhorros(String titular, double saldoInicial,
            double tasaInteres) {
        super(titular, saldoInicial); // El constructor de la superclase para
        // inicializar el titular y saldo
        this.tasaInteres = tasaInteres; // Tasa interes especifica a cuentaAhorros
    }

    // Método para calcular intereses 
    public void calcularInteres() {
        double interes = saldo * tasaInteres; // Se calcula el interes
        consignar(interes); // agregamos los intereses al saldo
        System.out.println("Intereses calculados = $ " + interes);
        
    }
}
