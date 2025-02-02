package com.alura.Herencia;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, String año, int numeroPuertas){
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString(){
        return  "marca: " + super.getMarca() + "\n" +
                "modelo: " + super.getModelo() + "\n" +
                "año: " + super.getAño() + "\n" +
                "numero de puertas: " + this.numeroPuertas;
    }
}
