package com.alura.JavaClaseObject;

import java.util.Objects;

/**
 * Por defecto todas las clases en Java extienden de Object,
 * por lo que no es necesario poner la palabra reservada extends Object. (Aqui a modo de ejemplo)
 *
 * La clase object es la superclase de todas las clases que implementamos en Java, porque tiene
 * metodos muy utiles que podemos sobreescribir en nuestras clases. (Aveces no es nesesario sobreescribir)
 *
 * Se desarrollara  un ejemplo para desarrollar la clase Object a traves de la clase Practica.
 */
public class Practica extends Object implements Cloneable{
     private String nombre;
     private String edad;

     public Practica(String nombre, String edad){
         this.nombre = nombre;
         this.edad = edad;
     }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }


    //Metodos sobreescritos de object

    /**
     * Metodo equals que sirve para hacer una comparacion del objeto actual pasado como argumente
     * para verficar si son iguales.
     * @param object
     * @return true and falso independientemente de si  son iguales o no
     */
    @Override
    public boolean equals(Object object){
        System.out.print("Se hizo la comparacion y resulto ser: ");
         return this == object;
    }

    /**
     * Este metodo es de tipo protegido por lo cual si no se sobreescribe no se puede utilizar ya que solo funciona en
     * la clase Padre (Object), para sobreescribir este metodo nesecitamos que se implemente CLoneable ya que sin esta no funciona
     * y como Cloneable extiende de una Excepcion verificada CheckedException nesecitamos agregar la firma del metodo
     * throws CloneNotSupportedException.
     * @return retorna la implementacion de la clase padre.
     * @throws CloneNotSupportedException es la exception verificada en este caso.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    /**
     * Es otro metodo de la clase Object.
     * @return es un metodo que devuelve un entero con numero hash, que representa la firma de un objeto, se utilizan
     * principalmente en los HasMap, HashSet que son estructuras de datps de busqueda asi no nesecitamos iterar.
     */
    @Override
    public int hashCode() {
        // Combina los hash codes de ambos atributos
        return Objects.hash(nombre, edad);
    }

    /**
     * Metodo de la clase Object - toString
     * @return Devuelve una representacion en cadena del objeto, basicamente
     * System.out.println(); utiliza el toString para devolvernos texto.
     */
    @Override
    public String toString(){
         return "Persona{nombre = '" + this.nombre + "', edad = '" + this.edad + "'}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Practica p1 = new Practica("Juan", "12");
        Practica p2 = new Practica("Juanita", "12");
        Practica p3 = p1;

        //uso de equals
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        //uso de clone
        Practica p4 = (Practica) p1.clone();
        System.out.println("clone uso: ");
        System.out.println(p4.equals(p1));

        System.out.println("datos " + p4.getEdad());
        System.out.println("datos2 " + p1.getEdad());

        //uso de hashcode
        Practica practica = new Practica("eder", "23");
        System.out.println("Hashcode hecho " + practica.hashCode());

        //uso de toString
        Practica tostring = new Practica("Ander" , "3");
        System.out.println(tostring);

        //usar getClass es final por lo que no necesita ser sobreescrito

        Practica getc = new Practica("ALice" , "23");

        System.out.println("getc pertenece a : " + getc.getClass());
        System.out.println(getc);



    }
}
