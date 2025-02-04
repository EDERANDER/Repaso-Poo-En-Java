package com.alura.Interface;

import com.alura.Interface.Exceptions.NoSePuedeIniciarSesion;

public class Gerente implements IniciarSesision {
    private double salario;
    private String nombre;
    private String contraseña;

    public Gerente(String nombre){
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void iniciarSesion(String contraseña) throws NoSePuedeIniciarSesion{
        if (this.contraseña.equals(contraseña)){
            System.out.println("Sesion iniciada");
        }else{
            throw new NoSePuedeIniciarSesion("Contraseña incorrecta");
        }
    }
    @Override
    public void cambiarContraseña(String newPassword){
        setContraseña(newPassword);
    }

}
