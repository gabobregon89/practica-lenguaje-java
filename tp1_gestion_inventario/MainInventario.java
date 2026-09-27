public MainInventario {
    
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestion de inventario");

        Producto producto1 = new Producto("Teclado", "P001", 10.0, 100);
        Producto producto2 = new Producto("Mouse", "P002", 20.0, 50);
        Producto producto3 = new Producto("Parlante", "P003", 30.0, 75);

        // Producto 1 - casos validos
        producto1.venderUnidades(30);
        producto1.reponerStock(20);
        producto1.actualizarPrecio(15.0);
        producto1.mostrarFicha();

        // Producto 2 - casos invalidos
        producto2.venderUnidades(60); // No hay suficiente stock
        producto2.reponerStock(-10); // Cantidad negativa
        producto2.actualizarPrecio(-5.0); // Precio negativo
        producto2.mostrarFicha();

        // Producto 3 - casos validos e invalidos
        producto3.venderUnidades(80); // No hay suficiente stock
        producto3.reponerStock(30);
        producto3.actualizarPrecio(25.0);
        producto3.mostrarFicha();

        // Producto copia
        Producto copia = producto1;
        System.out.println("Stock del producto 1: " + producto1.getStock());
        copia.setStock(200);
        System.out.println("Stock del producto 1 luego de la copia: " + producto1.getStock());

        // Aplicar descuento
        producto1.aplicarDescuento(10); // Descuento válido
        producto2.aplicarDescuento(150); // Descuento inválido

        // Arreglo de productos
        Producto[] productos = {producto1, producto2, producto3};
        System.out.println("=== Inventario de productos ===");
        for (Producto producto : productos) {
            producto.mostrarFicha();
        }
    }
}