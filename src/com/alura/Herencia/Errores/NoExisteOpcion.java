package com.alura.Herencia.Errores;

public class NoExisteOpcion extends RuntimeException {
    private String mensaje;

    /**
     *
     * @param mensaje
     * Constructor de nuestra Exception personalizada
     */
    public NoExisteOpcion(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Metodo que sobreescribe a getMessage() de la clase RuntimeException
     * RuntimeException es una clase con el tipo de excepciones no verificadas
     * @return
     */
    @Override
    public String getMessage(){
        return mensaje;
    }
}
