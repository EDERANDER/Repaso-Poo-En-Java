package com.alura.Interface2;

public interface Operaciones {

    default void ponerNota(Alumno alumno, double notaFinal) throws NoExisteEsaNotaException{
        if(notaFinal >=1 && notaFinal <= 20){
            alumno.notaFinal = notaFinal;
        }else {
            throw new NoExisteEsaNotaException("Ponga una nota valida...");
        }
    }
}
