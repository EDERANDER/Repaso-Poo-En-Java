package com.alura.Interface2;

public class NoExisteEsaNotaException extends Exception{
    String mensaje;
    public NoExisteEsaNotaException(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return this.mensaje;
    }

}
