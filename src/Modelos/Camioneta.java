package Modelos;

public class Camioneta extends VehiculoCuatroRuedas {
    public void encender() {
        System.out.println("La camioneta enciende.");
    }

    public void encender(String placa) {
        System.out.println("La camioneta de placa " + placa + " enciende!");
    }

    public void encender(double precio) {
        System.out.println("La camioneta de precio " + precio + " enciende!");
    }
}
