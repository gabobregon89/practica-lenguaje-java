public Libro () {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        this.titulo = validacionParametro(titulo) ? "Sin titulo" : titulo;
        this.autor = validacionParametro(autor) ? "Autor desconocido" : autor;
        this.isbn = validacionParametro(isbn) ? "ISBN pendiente" : isbn;
        this.copiasDisponibles = copiasDisponibles < 0 ? 0 : copiasDisponibles
        this.precioReposicion = validandoPrecio(precioReposicion) ? 15000.0 : precioReposicion;

        mensajeCasoInstanciaError(this.titulo, this.autor, this.isbn, this.copiasDisponibles, this.precioReposicion);
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean validacionParametro(String parametro) {
        return (parametro == null || parametro.isBlank());
    }

    public boolean validandoPrecio(double precioReposicion) {
        return precioReposicion < 0;
    }

    public void mensajeCasoInstanciaError(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (validacionParametro(titulo)) {
            System.out.println("ERROR: El título es inválido, no puede ser nulo ni vacio.");
        }
        if (validacionParametro(autor)) {
            System.out.println("ERROR: El autor es inválido, no puede ser nulo ni vacio.");
        }
        if (validacionParametro(isbn)) {
            System.out.println("ERROR: El ISBN es inválido, no puede ser nulo ni vacio.");
        }
        if (copiasDisponibles < 0) {
            System.out.println("ERROR: La cantidad de copias disponibles no puede ser negativa.");
        }
        if (precioReposicion < 0) {
            System.out.println("ERROR: El precio de reposición no puede ser negativo.");
        }
    }

    public boolean prestar() {
        if (this.copiasDisponibles > 0) {
            this.copiasDisponibles--;
            System.out.println("El prestamo se realizo correctamente.");
            return true;
        } else {
            System.out.println("ERROR: No hay copias disponibles para prestar.");
            return false;

        }
    }

    public void devolver() {
        this.copiasDisponibles++;
        System.out.println("El libro ha sido devuelto correctamente.");
    }

    public boolean setPrecioReposicion(double precio) {
        return validandoPrecio(precio);
    }

    public void mostrarFicha() { /* ... */ }
}