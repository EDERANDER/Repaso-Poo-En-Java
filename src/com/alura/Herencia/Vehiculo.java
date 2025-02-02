package com.alura.Herencia;

abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String año;

    /**
     * @param marca
     * @param modelo
     * @param año
     * Constructor de la clase Vehiculo que nos permite inicializar los atributos en las clases hijas
     */
    public Vehiculo(String marca, String modelo, String año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAño() {
        return año;
    }

    @Override
    public abstract String toString();
}
