package com.alura.Herencia.Errores;

public class NoExisteOpcion extends RuntimeException {
    private String mensaje;

    public NoExisteOpcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage(){
        return mensaje;
    }
}
