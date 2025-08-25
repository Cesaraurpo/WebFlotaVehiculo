public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Uso de super
        this.carrera = carrera;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy estudiante de " + carrera);
    }
}
