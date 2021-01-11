package Modelos;

import Interfaces.InterfaceVehiculo;

public class Vehiculo {

    // atributos
    private int kilometraje;
    private String motor;
    private int numRuedas;
    private String marca;
    private String tipo;
    public String color;
    public static String colorInterior;

    public Vehiculo() {
    }

    public Vehiculo(int kilometraje, String motor, int numRuedas, String marca, String tipo) {
        this.kilometraje = kilometraje;
        this.motor = motor;
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.tipo = tipo;

    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    //métodos
    public void encender() {
        System.out.println("El vehículo enciende...");
    }

    public void apagar() {
        System.out.println("El vehículo se apaga.");
    }

    public void frenar() {

    }

    public void andar() {
        System.out.println("El vehículo anda.");
    }


    // métodos Getter y Setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getColorInterior() {
        return colorInterior;
    }

    public static void setColorInterior(String colorInterior) {
        Vehiculo.colorInterior = colorInterior;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
