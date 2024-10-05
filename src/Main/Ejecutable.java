package Main;

import Objectos.CuentaAhorros;
import java.util.Scanner;

public class Ejecutable {

    private static class cuentaAhorros {

        public cuentaAhorros() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Solicitar datos al usuario
            System.out.println("Cuenta de ahorros");
            System.out.println("Ingrese saldo inicial = $");
            double saldoInicial = scanner.nextDouble();

            System.out.println("Ingrese tasa de interes =");
            double tasaInteres = scanner.nextDouble();

            // Crear una cuenta de ahorros con los datos ingresados
            CuentaAhorros cuentaAhorros = new CuentaAhorros("Titular",
                    saldoInicial,
                    tasaInteres);

            // Solicitar consignación
            System.out.print("Ingresar cantidad a consignar = $");
            double cantidadConsignar = scanner.nextDouble();
            cuentaAhorros.consignar(cantidadConsignar);

            // Solicitar retiro
            System.out.print("Ingresar cantidad a retirar = $");
            double cantidadRetirar = scanner.nextDouble();
            cuentaAhorros.retirar(cantidadRetirar);
            
            
            // Calcular intereses
            cuentaAhorros.calcularInteres();

            // Mostrar saldo, comisión mensual y número de transacciones
            cuentaAhorros.mostrarSaldo();
            cuentaAhorros.mostrarComision();
            cuentaAhorros.mostrarNumTransaciones();
            
        }
    }
}
