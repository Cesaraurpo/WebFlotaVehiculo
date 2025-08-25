import java.util.*;

public class EstadisticasLecturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de libros: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de libros debe ser mayor que cero.");
            return;
        }

        List<Double> lecturas = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Ingrese el valor #%d: ", i);
            lecturas.add(sc.nextDouble());
        }

        double suma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        int idx = 1;
        System.out.println("\nListado de lecturas:");
        for (double valor : lecturas) {
            System.out.printf("%d. %.2f\n", idx++, valor);
            suma += valor;
            if (valor < min) min = valor;
            if (valor > max) max = valor;
        }

        double promedio = suma / n;
        System.out.printf("\nEstadísticas:\nPromedio: %.2f\nMínimo: %.2f\nMáximo: %.2f\n", promedio, min, max);
        sc.close();
    }
}
