import java.util.Scanner;

public class FabricaJeans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== FABRICA DE JEANS ===");
        System.out.print("Ingrese la cantidad de jeans a producir: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el costo de la tela por unidad: $");
        double costoTela = scanner.nextDouble();

        System.out.print("Ingrese el modelo del jean (A / B): ");
        char modelo = Character.toUpperCase(scanner.next().charAt(0));

        double manoObra;

        // Calculo de mano de obra segun el modelo
        if (modelo == 'A') {
            manoObra = costoTela * 0.80;
        } else if (modelo == 'B') {
            manoObra = costoTela * 0.95;
        } else {
            System.out.println("Modelo no valido. Se aplicara Modelo A por defecto.");
            manoObra = costoTela * 0.80;
        }

        // Calculos por unidad
        double costoProduccion = costoTela + manoObra;
        double ganancia = costoProduccion * 0.30;
        double precioVenta = costoProduccion + ganancia;

        // Calculos totales
        double costoTotal = costoProduccion * cantidad;
        double gananciaTotal = ganancia * cantidad;
        double ventaTotal = precioVenta * cantidad;

        // Mostrar resultados
        System.out.println("\n=== RESUMEN DE PRODUCCION ===");
        System.out.printf("Costo de produccion por unidad: $%.2f%n", costoProduccion);
        System.out.printf("Ganancia por unidad: $%.2f%n", ganancia);
        System.out.printf("Precio de venta por unidad: $%.2f%n", precioVenta);
        System.out.println("----------------------------------");
        System.out.printf("Costo Total del Lote: $%.2f%n", costoTotal);
        System.out.printf("Ganancia Total del Lote: $%.2f%n", gananciaTotal);
        System.out.printf("Ingreso Total por Venta: $%.2f%n", ventaTotal);

        scanner.close();
    }
}