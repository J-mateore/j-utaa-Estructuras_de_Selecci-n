import java.util.Scanner;

public class controlHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos;
        char respuesta;

        do {
            // Captura de datos
            System.out.print("Ingrese las horas (0 a 23): ");
            horas = scanner.nextInt();
            System.out.print("Ingrese los minutos (0 a 59): ");
            minutos = scanner.nextInt();
            System.out.print("Ingrese los segundos (0 a 59): ");
            segundos = scanner.nextInt();

            // Validacion y formato
            if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
                System.out.printf("Hora registrada exitosamente: %02d:%02d:%02d%n", horas, minutos, segundos);
            } else {
                System.out.println("Error: La hora ingresada no es valida.");
            }

            // Consulta de repeticion
            System.out.print("¿Desea cambiar la hora? (S/N): ");
            respuesta = scanner.next().charAt(0);

        } while (respuesta == 'S' || respuesta == 's');

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}