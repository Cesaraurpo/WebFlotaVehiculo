import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Capturar nombre del usuario o vivienda
        System.out.print("Ingrese el nombre del usuario o vivienda: ");
        String nombreUsuario = sc.nextLine();

        // 2. Capturar lectura inicial y final del medidor
        System.out.print("Ingrese la lectura inicial del mes (en litros): ");
        int lecturaInicial = sc.nextInt();

        System.out.print("Ingrese la lectura final del mes (en litros): ");
        int lecturaFinal = sc.nextInt();

        // Validar que la lectura final sea mayor que la inicial
        if (lecturaFinal <= lecturaInicial) {
            System.out.println("Error: la lectura final debe ser mayor que la lectura inicial.");
        } else {
            // 3. Calcular consumo total en litros
            int consumo = lecturaFinal - lecturaInicial;

            // 4. Calcular costo total
            double tarifaPorLitro = 0.15;
            double costoTotal = consumo * tarifaPorLitro;

            // 5. Mostrar resumen
            System.out.println("\n--- Resumen del consumo ---");
            System.out.println("Usuario: " + nombreUsuario);
            System.out.println("Consumo: " + consumo + " litros");
            System.out.println("Costo total: $" + costoTotal);
        }

        sc.close();
    }
}
