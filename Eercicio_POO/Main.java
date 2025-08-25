public class Main {
    public static void main(String[] args) {
        // Clases y objetos
        Persona p = new Persona("Carlos", 30);
        p.saludar();

        // Herencia y polimorfismo
        Persona est = new Estudiante("Ana", 20, "Ingeniería");
        Persona prof = new Profesor("Luis", 45, "Matemáticas");

        est.saludar();
        prof.saludar();

        // Polimorfismo con clases abstractas
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();

        // Uso de static y final
        System.out.println("PI = " + Utilidades.PI);
        System.out.println("Suma = " + Utilidades.sumar(5, 3));

        // Uso de equals y hashCode
        Caja<String> caja1 = new Caja<>("Libro");
        Caja<String> caja2 = new Caja<>("Libro");

        System.out.println(caja1);
        System.out.println("¿Son iguales? " + caja1.equals(caja2));
    }
}
