import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(titulo, autor, anioPublicacion);

        libro.mostrarInfo();

        while (true) {
            System.out.println("¿Qué dato desea cambiar?");
            System.out.println("1. Actualizar estado (Disponible/Prestado)");
            System.out.println("2. Modificar título");
            System.out.println("3. Modificar autor");
            System.out.println("4. Modificar año de publicación");
            System.out.println("5. Mostrar información del libro");
            System.out.println("6. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo estado del libro (Disponible/Prestado):");
                    String nuevoEstado = sc.nextLine();
                    libro.setEstado(nuevoEstado);
                    break;

                case 2:
                    System.out.println("Ingrese el nuevo título del libro:");
                    String nuevoTitulo = sc.nextLine();
                    libro.setTitulo(nuevoTitulo);
                    break;

                case 3:
                    System.out.println("Ingrese el nuevo autor del libro:");
                    String nuevoAutor = sc.nextLine();
                    libro.setAutor(nuevoAutor);
                    break;

                case 4:
                    System.out.println("Ingrese el nuevo año de publicación:");
                    int nuevoAnio = sc.nextInt();
                    sc.nextLine();
                    libro.setAnioPublicacion(nuevoAnio);
                    break;

                case 5:
                    libro.mostrarInfo();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }
        }
    }
}