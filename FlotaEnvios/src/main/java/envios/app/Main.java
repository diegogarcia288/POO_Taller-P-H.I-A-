/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package envios.app;

import envios.modelo.Asegurable;
import envios.modelo.Bicicleta;
import envios.modelo.Bodega;
import envios.modelo.Camion;
import envios.modelo.Flota;
import envios.modelo.Moto;
import envios.modelo.Vehiculo;
import java.util.ArrayList;
/**
 *
 * @author User
 */


public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("MZL12A", 20, 150);
        Camion c1 = new Camion("WFT345", 8000, 2);
        Moto m2 = new Moto("KJH78B", 25, 200);

        Flota flota = new Flota("Envíos Caldas");
        flota.agregar(m1);
        flota.agregar(c1);
        flota.agregar(m2);
        flota.agregar(new Bicicleta("BIC001", 10));

        System.out.println(m1.valorSeguro());
        System.out.println(c1.valorSeguro());
        System.out.println(flota.totalSeguros());

        ArrayList<Asegurable> asegurables = new ArrayList<>();
        asegurables.add(c1);
        asegurables.add(new Bodega("Bodega Chipre", 300));

        double sumaAsegurables = 0;
        for (Asegurable a : asegurables) {
            double seguro = a.valorSeguro();
            System.out.println(seguro);
            sumaAsegurables += seguro;
        }
        System.out.println(sumaAsegurables);
    }
}
