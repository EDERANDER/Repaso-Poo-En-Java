package com.alura.Interface.Exceptions;

public class NoSePuedeIniciarSesion extends Exception{
    private String mensaje;

    public NoSePuedeIniciarSesion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return mensaje;
    }
}
