import java.util.Scanner;

public class CuentasBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double saldo = 100.0; // Saldo inicial
        double monto;

        do {
            System.out.println("=== MENU BANCARIO ===");
            System.out.printf("Saldo actual: $%.2f%n", saldo);
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: $");
                    monto = scanner.nextDouble();
                    if (monto > 0) {
                        saldo += monto;
                        System.out.printf("Deposito realizado. Nuevo saldo: $%.2f%n", saldo);
                    } else {
                        System.out.println("Error: El monto debe ser mayor a 0.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el monto a retirar: $");
                    monto = scanner.nextDouble();
                    if (monto > 0 && monto <= saldo) {
                        saldo -= monto;
                        System.out.printf("Retiro realizado. Nuevo saldo: $%.2f%n", saldo);
                    } else if (monto > saldo) {
                        System.out.println("Error: Saldo insuficiente.");
                    } else {
                        System.out.println("Error: El monto debe ser mayor a 0.");
                    }
                    break;

                case 3:
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            System.out.println();

        } while (opcion != 3);

        scanner.close();
    }
}