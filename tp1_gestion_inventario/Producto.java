public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private int stock;

    public Producto() {}

    public Producto(String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void venderUnidades(int cantidad) {

        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta exitosa.");
        } else if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad a vender debe ser mayor a cero.");
        } else {
            System.out.println("ERROR: No hay suficiente stock para realizar la venta.");         
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("Reposicion exitosa.");
        } else {
            System.out.println("ERROR: La cantidad a reponer debe ser mayor a cero.");
        }
    }

    public void actualizarPrecio(double precio) {
        if (precio > 0) {
            System.out.println("Precio anterior: " + this.precio);
            this.precio = precio;
            System.out.println("Precio actualizado correctamente.");
            System.out.println("Precio actual: " + this.precio);
        } else {
            System.out.println("ERROR: El precio debe ser mayor a cero.");
        }
    }

    public void mostrarFicha() {
        String nombreProducto = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
        String codigoProducto = (codigo != null && !codigo.isBlank()) ? codigo : "N/A";

        System.out.println("=== Ficha de producto ===");
        System.out.printf("Código:  %s%n", codigoProducto);
        System.out.printf("Nombre:  %s%n", nombreProducto);
        System.out.printf("Precio:  $%.1f%n", precio);
        System.out.printf("Stock:   %d%n", stock);
        System.out.println("==========================");
    }
}