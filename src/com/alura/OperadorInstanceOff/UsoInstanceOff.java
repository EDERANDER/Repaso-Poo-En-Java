package com.alura.OperadorInstanceOff;

/**
 * La clase UsoInstanceOff demuestra el uso del operador `instanceof` en Java.
 * El operador `instanceof` se utiliza para verificar si un objeto es una instancia de una clase específica
 * o de una de sus subclases.
 */
public class UsoInstanceOff {

    /**
     * Método main para ejecutar el código.
     * Crea instancias de las clases Contador y Gerente y utiliza el operador `instanceof` para verificar sus tipos.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear una instancia de Contador
        Contador contador = new Contador("Juan");
        // Crear una instancia de Gerente
        Gerente gerente = new Gerente("Pedro");

        // Verificar si contador es una instancia de Contador usando instanceof
        if (contador instanceof Contador) {
            System.out.println("nombre contador: " + contador.getNombre());
        }

        // Verificar si gerente es una instancia de Gerente usando instanceof
        if (gerente instanceof Gerente) {
            System.out.println("nombre gerente: " + gerente.getNombre());
        }

        // Verificar si contador es una instancia de Contador usando getClass
        if (contador.getClass() == Contador.class) {
            System.out.println("Es un contador");
        }
    }
}