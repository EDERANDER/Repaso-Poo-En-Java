package com.alura.Interface;

import com.alura.Interface.Exceptions.NoSePuedeIniciarSesion;

public class Principal {
    public static void main(String[] args) {
        try{
            Gerente gerente = new Gerente("Juan");
            gerente.setContraseña("son");
            gerente.iniciarSesion("gfgfd");
        }catch (NoSePuedeIniciarSesion e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Fin del programa");
        }

    }
}
