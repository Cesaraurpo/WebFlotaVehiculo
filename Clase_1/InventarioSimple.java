import java.util.*;

public class InventarioSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();

        System.out.print("Ingrese el número de productos: ");
        int M = 0;
        while (M <= 0) {
            try {
                M = Integer.parseInt(sc.nextLine().trim());
                if (M <= 0) System.out.print("Debe ser mayor que 0. Intente de nuevo: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Intente de nuevo: ");
            }
        }

        for (int i = 0; i < M; i++) {
            String nombre = "";
            while (nombre.isEmpty()) {
                System.out.print("Nombre del producto #" + (i + 1) + ": ");
                nombre = sc.nextLine().trim();
                if (nombre.isEmpty()) System.out.println("El nombre no puede estar vacío.");
            }
            int stock = -1;
            while (stock < 0) {
                System.out.print("Stock de " + nombre + ": ");
                try {
                    stock = Integer.parseInt(sc.nextLine().trim());
                    if (stock < 0) System.out.println("El stock no puede ser negativo.");
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida.");
                }
            }
            inventario.put(nombre, stock);
        }

        // Mostrar inventario
        System.out.println("\nInventario:");
        inventario.forEach((k, v) -> System.out.println(k + ": " + v));

        // Total de unidades
        int total = 0;
        String maxProducto = "";
        int maxStock = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            total += entry.getValue();
            if (entry.getValue() > maxStock) {
                maxStock = entry.getValue();
                maxProducto = entry.getKey();
            }
        }
        System.out.println("Total de unidades: " + total);
        System.out.println("Producto con mayor stock: " + maxProducto + " (" + maxStock + ")");
    }
}
