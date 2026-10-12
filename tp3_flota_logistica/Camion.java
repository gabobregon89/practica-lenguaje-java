package tp3_flota_logistica;

public class Camion  extends Vehiculo {
    
    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override 
    public double calcularCostoViaje(double distanciaKm) {
        double costo = super.calcularCostoViaje(distanciaKm);
        return costo * (1 + capacidadToneladas * 0.05);
    }

    @Override 
    public void mostrarFicha(double distanciaKm, double costoKm) {
        System.out.println("[Vehiculo] Camion" 
        + " | " +  "Patente: " + patente 
        + " | " + "Marca: " + marca
        + " | " + "Toneladas: " + capacidadToneladas);
        System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costoKm);
    }
}
