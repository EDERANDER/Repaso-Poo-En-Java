package com.alura.OperadorInstanceOff;

public class Contador{
    private String nombre;
    public Contador(String nombre){
       this.nombre = nombre;
    }


    public String getNombre(){
        return "Contador:" + nombre;
    }

}
