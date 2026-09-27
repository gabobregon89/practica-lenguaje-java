public class MainBiblioteca {

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de catalogo de biblioteca");

        Libro libro1 = new Libro("", "Miguel de Cervantes", "978-3-16-148410-0", 5, 20000.0);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "978-3-16-148410-1", 3, 25000.0);
        Libro libro3 = new Libro("1984", "George Orwell", "978-3-16-148410-2");

        // Libro libro4 = new Libro(); // no compila
        // porque al sobrecargar el constructor, se eliminó el constructor por defecto que me entrega la clase Object.

        // Libro 1
        System.out.println("=== Libro 1 ===");
        System.out.printf("Titulo: %s%n", libro1.getTitulo());
        System.out.println("Precio valido o no?? --> " + libro1.setPrecioReposicion(-20000.0));
        System.out.printf("Precio de reposicion: $%.2f%n", libro1.getPrecioReposicion());

        // Libro 2
        System.out.println("=== Libro 2 ===");
        while (libro2.prestar()) {
            System.out.println("Prestamo exitoso. Copias disponibles: " + libro2.getCopiasDisponibles());
        }

        System.out.println("Confirmando que el valor no quedo en negativo.");
        System.out.println("Copias disponibles: " + libro2.getCopiasDisponibles());

        // Mostrando datos
        Libro[] libros = {libro1, libro2, libro3};
        System.out.println("=== Catalogo de libros ===");
        for (Libro libro : libros) {
            libro.mostrarFicha();
        }

        // Libro 5 - caso de instancia con errores
        System.out.println("=== Libro 5 ===");
        Libro libro5 = new Libro("", "", null, 0, -1000.0);

        // Prestamos historicos
        System.out.println("Prestamos historicos del libro 2: " + libro2.getPrestamosHistoricos());
    } 
}