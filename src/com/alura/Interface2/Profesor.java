package com.alura.Interface2;

public class Profesor implements Operaciones{
    private String nombre;
    private String id;

    public Profesor (String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "Id: " + getId();
    }



}
