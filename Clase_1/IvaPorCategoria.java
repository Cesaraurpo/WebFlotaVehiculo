import java.util.Scanner;

public class IvaPorCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría: ");
        String categoria = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();

        double porcentajeIva;
        switch (categoria) {
            case "alimentos":
                porcentajeIva = 0.05;
                break;
            case "tecnologia":
                porcentajeIva = 0.19;
                break;
            case "ropa":
                porcentajeIva = 0.12;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        double iva = precioBase * porcentajeIva;
        double total = precioBase + iva;

        System.out.printf("Subtotal: %.2f\n", precioBase);
        System.out.printf("IVA (%.0f%%): %.2f\n", porcentajeIva * 100, iva);
        System.out.printf("Total: %.2f\n", total);
        sc.close();
    }
}
