import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Otro saludo");
        System.out.println("Programacion en Java");
        System.err.print("hello"); */
        //println genera un salto de linea, mientras que print no

        //Manejo de variables
        /* int edad = 25;
        System.out.println("La edad es: " + edad); */
        //System.out.printf("Su edad es: %d%n", edad);
//estas son dos formas de concatenar texto con variables

        /* double precio = 99.99;
        char inicial = 'J';
        Boolean esMayor = true;
        String nombre = "Juan"; */

        /* int numero1 = 10;
        int numero2 = 15;

        int resultado = numero1 + numero2;

        System.out.print("El resultado es: " + resultado); */

        //uso de scanner para capturar datos desde la consola
        /* java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + "!");

        //capturar numeros enteros
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);

        //capturar numeros decimales
        System.out.print("Ingrese su altura en metros (ej: 1,75): ");
        double altura = sc.nextDouble();
        System.out.println("Tu altura es: " + altura);

        //capturar un caracter
        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0);
        System.out.println("Su inicial es: " + inicial);

        //capturar un booleano
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        System.out.println("¿Eres estudiante? " + esEstudiante);

        // el /n es un salto de linea

        //precaucion con nextLine() después de nextInt() o nextDouble()
        //cuando se usa nextInt() o nextDouble(), queda un salto de linea (/n) en el buffer
        //lo que puede causar que nextLine() se salte la entrada del usuario.
        // Para evitarlo usa un scanner nextLine() después de nextInt() o nextDouble() para limpiar el buffer.

        //capturar un string
        System.out.print("Ingrese su nombre: ");
        String name = sc.nextLine();
        
        //capturar un numero entero
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();

        // Condicionales
        /* System.out.println("Ingrese su edad:");
        int age = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        int age_parameter = 18; */

        // boolean tieneBoleta = true;

        // if (! (age < age_parameter || !tieneBoleta)) {
        //     System.out.println("Puede ingresar.");
        // } else {
        //     System.out.println("No puede ingresar.");
        // }

        /* if (age >= 18 && tieneBoleta) {
            System.out.println("Puede ingresar.");
        } else if (age < 18 && !tieneBoleta) {
            System.out.println("No puede ingresar.");
        } else if (age < 18 && tieneBoleta) {
            System.out.println("Puede ingresar, pero debe ir acompañado de un adulto.");
        } else {
            System.out.println("No puede ingresar.");
        } */


        // operador ternario
        /* String mensaje = age >= 18 ? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(mensaje);

        mensaje = age >= 18 && tieneBoleta ? "Puede ingresar." : "No puede ingresar.";
        System.out.println(mensaje); */



        /* int edad = 19;
        boolean tieneBoleta = true;
        java.time.LocalDate fechaEvento = java.time.LocalDate.parse("2025-08-14");
        String mensaje = "";

        if (edad >= 18) {
            if (tieneBoleta) {
                if (fechaEvento.isAfter(java.time.LocalDate.now())) { // .isAfter compara si la fecha del evento es posterior a la fecha actual
                    mensaje = "Puede ingresar al evento.";            // .isEqual compara si la fecha del evento es igual a la fecha actual
                } else {
                    mensaje = "El evento ya ha pasado.";
                }
            } else {
                mensaje = "No puede ingresar, necesita una boleta.";
            }
        } else {
            mensaje = "No puede ingresar, es menor de edad.";
        }

        System.out.println(mensaje); */


        /* int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");                
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
                break;
        }


        // Desde java 14 se puede usar switch como expresión
        String diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };

        System.out.println(diaSemana); */

        //Ejemplo de estructura repetitiva for (con break): detiene la ejecucion del ciclo, pero no del programa. Es importante tener en cuenta que el break detiene el cilo mas cercano. Y se usa en casos como cuando se cumple una condicion y no se quiere seguir iterando. Un caso real es cuando se busca un elemento en un arreglo y se desea detener la busqueda cuando se encuetnra.

        //Sintaxis
        /* for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // Detiene el ciclo cuando i es 3
            }
            System.out.println("iteración: " + 1);
        } */

        //Ejemplo

        /* int[] numeros = {1, 2, 3, 4, 5};
        int numeroBuscado = 3;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break; // Detiene la búsqueda cuando encuentra el número
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado.");
        } else {
            System.out.println("Número no encontrado.");
        } */

        //Ejemplo de estructura repetitiva for (con continue): detiene la iteracion actual y continua con la siguiente. Se usa en casos como cuando se cumple una condicio y se desea continuar con el ciclo. Un caso real es cuando se quiere omitir ciertos elementos en un arreglo.

        //Sintaxis
        /* for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Omite la iteración cuando i es 3
            }
            System.out.println("Iteración: " + i);
        } */

        //Estructura repetitiva for (con continue) para el caso real es cuando se quiere omitir ciertos elementos en un arreglo.

        /* int[] numeros = {1, 2, 3, 4, 5};
        int numeroOmitir = 3;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroOmitir) {
                continue; // Omite la iteración cuando encuentra el número a omitir
            }
            System.out.println("Número: " + numeros[i]);
        } */

        /* String[] comportamiento = {"Disciplinado", "Serio", "Indisciplinado", "Juicioso", "Amable"};
        String comportamientoOmitido = "Indisciplinado";

        for (int i = 0; i < comportamiento.length; i++) {
            if (comportamiento[i].equals(comportamientoOmitido)) {
                continue; // Omite la iteración cuando encuentra el comportamiento a omitir
            }
            System.out.println("Comportamiento: " + comportamiento[i]);
        } */

        //While con break y continue
        /* int i = 1;
        while (i <= 5) {
            if (i == 3) {
                break; // Detiene el ciclo cuando i es 3
            }
            System.out.println("Iteración: " + i);
            i++;
        }

        i = 1;
        while (i <= 5) {
            if (i == 3) {
                continue; // Omite la iteración cuando i es 3
            }
            System.out.println("Iteración: " + i);
            i++;
        } */

        //Do While con break y continue
            /* i = 1;
            do {
                if (i == 3) {
                    break; // Detiene el ciclo cuando i es 3
                }
                System.out.println("Iteración: " + i);
                i++;
            } while (i <= 5);

            i = 1;
            do {
                if (i == 3) {
                    continue; // Omite la iteración cuando i es 3
                }
                System.out.println("Iteración: " + i);
                i++;
            } while (i <= 5); */

        //Sintaxis
        /* for (TipoElemento variable : coleccion) {
            // Instrucciones
        } */

        //Ejemplo con array
        /* String[] frutas = {"Manzana", "Banana", "Cereza"};

        for (String fruta : frutas) {
            System.out.println(fruta);
        } */

        //Ejemplo con ArrayList
        /* ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        for (String color : colores) {
            System.out.println(color);
        } */

        //Ejemplo List
        /* List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        //forEach clasico
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        //forEach moderno
        frutas.forEach(f -> System.out.println("-> " + f)); */

        

        //sc.close(); // Cerrar el scanner para liberar recursos
    }
}