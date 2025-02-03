package com.alura.Herencia;

import com.alura.Herencia.Errores.NoExisteOpcion;
import java.util.Scanner;

/**
 * La clase Moto extiende de la clase abstracta Vehiculo.
 * Representa una moto con atributos adicionales específicos.
 */
public class Moto extends Vehiculo {
    private String tipoConbustible;

    /**
     * Constructor de la clase Moto.
     *
     * @param marca La marca de la moto.
     * @param modelo El modelo de la moto.
     * @param año El año de fabricación de la moto.
     * @param tipoConbustible El tipo de combustible de la moto.
     */
    public Moto(String marca, String modelo, String año, String tipoConbustible) {
        super(marca, modelo, año);
        setTipoConbustible();
    }

    /**
     * Método para establecer el tipo de combustible de la moto.
     * Lanza una excepción si la opción no es válida.
     */
    public void setTipoConbustible() {
        String mensaje = "Objeto creado";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 si es a gasolina y 2 si es a otro tipo");
        String opcion = scanner.nextLine();

        if (opcion.equals("1")) {
            this.tipoConbustible = "gasolina";
            System.out.println(mensaje);
        } else if (opcion.equals("2")) {
            this.tipoConbustible = "otro";
            System.out.println(mensaje);
        } else {
            throw new NoExisteOpcion("Esa opción no está disponible");
        }
    }

    /**
     * Método para obtener el tipo de combustible de la moto.
     *
     * @return El tipo de combustible de la moto.
     */
    public String getTipoConbustible() {
        return this.tipoConbustible;
    }

    /**
     * Método sobrescrito de la clase Object.
     *
     * @return Una cadena de texto con la información de la moto.
     */
    @Override
    public String toString() {
        return "marca: " + super.getMarca() + "\n" +
                "modelo: " + super.getModelo() + "\n" +
                "año: " + super.getAño() + "\n" +
                "combustible: " + getTipoConbustible();
    }
}