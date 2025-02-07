package com.alura.Interface2;

public class Alumno extends Profesor{
    private String grado;
    protected double notaFinal;

    public Alumno(String nombre, String id, String grado) {
        super(nombre, id);
        this.grado = grado;
    }


}
