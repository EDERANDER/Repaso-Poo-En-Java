package com.alura.Herencia;

abstract class Vehiculo {
    /**
     * Atributos de la clase abstracta de vehiculo
     */
    private String marca;
    private String modelo;
    private String año;

    /**
     * @param marca
     * @param modelo
     * @param año
     * Constructor de la clase Vehiculo que nos permite realizar
     * la inicializacion de parametros de los atributos
     * en las clases hijas, con el fin de crear un objeto nuevo.
     */
    public Vehiculo(String marca, String modelo, String año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    /**
     *
     * @return la marca de Vehiculo
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return el modelo del vehiculo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @return el año de fabrica del vehiculo
     */
    public String getAño() {
        return año;
    }

    /**
     *Es un metodo sobreescrito de la clase Objecto especificamente toString
     * @return no retorna nada porque es un metodo abstracto
     */
    @Override
    public abstract String toString();
}
