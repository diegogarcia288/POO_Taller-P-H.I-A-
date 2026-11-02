/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;
import java.util.ArrayList;


/**
 *
 * @author User
 */

public class Flota {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public boolean agregar(Vehiculo vehiculo) {
        if (vehiculo == null) {
            return false;
        }
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                return false;
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (Vehiculo v : vehiculos) {
            System.out.println("- " + v.describir());
        }
    }

    public int cantidadCamiones() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                contador++;
            }
        }
        return contador;
    }

    public Vehiculo masEconomico(int pesoKg) {
        Vehiculo mejorVehiculo = null;
        double menorTarifa = Double.MAX_VALUE;

        for (Vehiculo v : vehiculos) {
            if (v.getCapacidadKg() >= pesoKg) {
                if (v.tarifaPorKm() < menorTarifa) {
                    menorTarifa = v.tarifaPorKm();
                    mejorVehiculo = v;
                }
            }
        }
        return mejorVehiculo;
    }

    // Método totalSeguros de la Etapa 4
    public double totalSeguros() {
        double suma = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Asegurable) {
                suma += ((Asegurable) v).valorSeguro();
            }
        }
        return suma;
    }

    public String getNombre() {
        return nombre;
    }
}