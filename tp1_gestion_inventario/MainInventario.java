public static void main(String[] args) {

    System.out.println("Bienvenido al sistema de gestion de inventario");

    Producto producto1 = new Producto("Teclado", "P001", 10.0, 100);
    Producto producto2 = new Producto("Mouse", "P002", 20.0, 50);
    Producto producto3 = new Producto("Parlante", "P003", 30.0, 75);

    // Producto 1
    producto1.venderUnidades(30);

}