package Ejecutores;

import Interfaces.InterfaceVehiculo;
import Modelos.*;

public class Main {

    public static void main(String[] args) {

        Vehiculo.colorInterior = "Azul";

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("mazda");
        vehiculo.setKilometraje(2);
        vehiculo.setTipo("bcd");

        Vehiculo vehiculo1 = new Vehiculo(3, "1800", 2, "honda", "abc");

        Vehiculo vehiculo2 = new Vehiculo("Hyundai");

        Vehiculo vehiculo3 = new Vehiculo(3);

        vehiculo.color = "Gris";




        System.out.println(vehiculo.getMarca());
        System.out.println(vehiculo1.getMarca());
        System.out.println(vehiculo2.getMarca());
        System.out.println(vehiculo3.getMarca());

        System.out.println(vehiculo.getColor());


        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = vehiculo;
        vehiculos[1] = vehiculo1;
        vehiculos[2] = vehiculo2;
        vehiculos[3] = vehiculo3;


    }


}
