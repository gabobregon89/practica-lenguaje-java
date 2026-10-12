package tp3_flota_logistica;

public class Furgoneta  extends Vehiculo {
    
    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = super.calcularCostoViaje(distanciaKm);
        if (tieneRefrigeracion) {
            costo += 5000.00; // Aumenta un 10% si tiene refrigeración
        }
        return costo;
    }

    @Override 
    public void mostrarFicha(double distanciaKm, double costoKm) {
        System.out.println("[Vehiculo] Camion" 
        + " | " +  "Patente: " + patente 
        + " | " + "Marca: " + marca
        + " | " + "Refrigerado: " + (tieneRefrigeracion ? "Sí" : "No"));
        System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costoKm);
    }
}
