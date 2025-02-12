package com.alura.ProgramaManejoExcepciones.ExcepcionesPersonalisadas;

public class NoSePuedeDividirEntreCero extends Exception{
    private String mensaje;
    public NoSePuedeDividirEntreCero(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }
}
