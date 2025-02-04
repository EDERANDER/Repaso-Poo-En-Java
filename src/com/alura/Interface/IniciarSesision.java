package com.alura.Interface;

import com.alura.Interface.Exceptions.NoSePuedeIniciarSesion;

/**
 * Esta es una Interface que tiene un metodo iniciarSesion
 * que recibe un String contraseña y lanza una excepcion.
 *
 * Las Interface sirven para definir un contrato que deben cumplir
 * las clases que la implementen.
 *
 * -Las interface no se pueden instanciar new IniciarSesision();
 * -Las interface no pueden tener atributos.
 *
 * Reglas clave de las interfaces en Java:
 * 1 No pueden tener atributos de instancia, pero sí constantes (public static final).
 * 2 Métodos abstractos (por defecto son public abstract y deben implementarse en la clase).
 * 3 Métodos default (tienen implementación y no necesitan ser sobrescritos).
 * 4 Métodos static (se llaman directamente desde la interfaz, sin instancia).
 * 5 Métodos private (desde Java 9, solo se usan dentro de la interfaz).
 */
public interface IniciarSesision {

    /**
     * Este es un metodo abstracto sin cuerpo, sabemos que es public y abstract y no hay nesecidad
     * de escribir las palabras reservadas.
     *
     * @param contraseña
     * @throws NoSePuedeIniciarSesion
     */
    void iniciarSesion(String contraseña) throws NoSePuedeIniciarSesion;

    void cambiarContraseña(String newPassword);
}
