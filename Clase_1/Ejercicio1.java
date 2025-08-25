public class Ejercicio1 {
    public static void main(String[] args) {
        // Precios actuales
        double precioZapatos = 350000;
        double precioTenis = 280000;
        double precioCamisetas = 175000;
        double precioJeans = 200000;

        // Mostrar los artículos y precios actuales
        System.out.println("Almacen WC");
        System.out.println("Precio de los Zapatos: $" + precioZapatos);
        System.out.println("Precio de los Tenis: $" + precioTenis);
        System.out.println("Precio de las Camisetas: $" + precioCamisetas);
        System.out.println("Precio de los Jeans: $" + precioJeans);

        // Costo total de los 4 artículos
        double costoTotal = precioZapatos + precioTenis + precioCamisetas + precioJeans;
        System.out.println("\nTotal: $" + costoTotal);

        // Promedio de venta
        double promedio = costoTotal / 4;
        System.out.println("Promedio de Precios: $" + promedio);

        // Subir el precio de los Jeans en 6.2%
        double nuevoPrecioJeans = precioJeans * (1 + 0.062);

        // Disminuir el precio de los Zapatos en 0.8%
        double nuevoPrecioZapatos = precioZapatos * (1 - 0.008);

        // Mostrar nuevos valores
        System.out.println("Nuevo Precio Zapatos: $" + nuevoPrecioZapatos);
        System.out.println("Nuevo Precio Jeans: $" + nuevoPrecioJeans);
    }
}
