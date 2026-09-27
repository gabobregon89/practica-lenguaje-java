public Libro () {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro() {};

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponibles = copiasDisponibles;
        this.precioReposicion = precioReposicion;
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 0, 0.0);
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

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public void setPrecioReposicion(double precioReposicion) {
        this.precioReposicion = precioReposicion;
    }

}