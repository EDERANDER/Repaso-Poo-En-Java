package com.alura.ProgramaManejoExcepciones.Principal;

import com.alura.ProgramaManejoExcepciones.ExcepcionesPersonalisadas.NoSePuedeDividirEntreCero;

public class Calculadora {
    public double sumar(double a, double b){
        return a + b;
    }

    public double restar(double a, double b){
        return a - b;
    }

    public double dividir(double a, double b)throws NoSePuedeDividirEntreCero {
        if (b == 0) {
            throw new NoSePuedeDividirEntreCero("infinito");
        }else{
            return a / b;
        }
    }
    public double multiplicar(double a, double b){
        return a * b;
    }
}
