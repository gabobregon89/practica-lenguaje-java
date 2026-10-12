package tp3_flota_logistica;

public class Vehiculo {
    
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return distanciaKm * costoBaseKm + peajes;
    }

    public void mostrarFicha(double distanciaKm, double costoKm) {
        System.out.println("[Vehiculo] " + " | " +  "Patente: " + patente + " | " + "Marca: " + marca);
        System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costoKm);
    }
}
