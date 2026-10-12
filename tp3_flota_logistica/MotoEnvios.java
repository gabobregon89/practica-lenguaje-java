package tp3_flota_logistica;

public class MotoEnvios extends Vehiculo {
    
    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = super.calcularCostoViaje(distanciaKm);
        return costo * 0.85; // Descuento del 15%
    }

    @Override 
    public void mostrarFicha(double distanciaKm, double costoKm) {
        System.out.println("[Vehiculo] Camion" 
        + " | " +  "Patente: " + patente 
        + " | " + "Marca: " + marca
        + " | " + "Mensajeria liviana");
        System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costoKm);
    }   
}
