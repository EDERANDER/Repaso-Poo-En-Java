package com.alura.Herencia;

/**
 * La clase Coche extiende de la clase abstracta Vehiculo.
 * Representa un coche con atributos adicionales específicos.
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    /**
     * Constructor de la clase Coche.
     *
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     * @param año El año de fabricación del coche.
     * @param numeroPuertas El número de puertas del coche.
     */
    public Coche(String marca, String modelo, String año, int numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Metodo sobrescrito de la clase object.
     *
     * @return Una cadena de texto con la información del coche.
     */
    @Override
    public String toString() {
        return "marca: " + super.getMarca() + "\n" +
                "modelo: " + super.getModelo() + "\n" +
                "año: " + super.getAño() + "\n" +
                "numero de puertas: " + this.numeroPuertas;
    }
}