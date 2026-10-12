package tp3_flota_logistica;

public class MainFlota {
    
    public static void main(String[] args) {

        // Crear un arreglo de vehículos
        Vehiculo[] flota = new Vehiculo[3];

        // Crear instancias de vehículos
        Vehiculo camion = new Camion("XYZ789", "Mercedes", 150.0, 18.0);
        Vehiculo furgoneta = new Furgoneta("ABC123", "Ford", 100.0, true);
        Vehiculo motoEnvios = new MotoEnvios("MOTO456", "Honda", 80.0);

        // Agregar vehículos al arreglo
        flota[0] = camion;
        flota[1] = furgoneta;
        flota[2] = motoEnvios;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        // Recorrer el arreglo, calcular costo y mostrar la ficha de cada vehículo
        double costoTotal = 0;
        for (Vehiculo vehiculo : flota) {
            double distancia = 150.0; // Distancia en km

            // Calcular costos de viaje
            double costoViaje = vehiculo.calcularCostoViaje(distancia);

            // Mostrar fichas de los vehículos
            vehiculo.mostrarFicha(distancia, costoViaje);
            System.out.println("--------------------------------------------------");

            // Acumular el costo total de la flota
            costoTotal += costoViaje;
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);

    }
}
