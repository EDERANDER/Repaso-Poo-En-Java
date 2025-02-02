package com.alura.Herencia;

import com.alura.Herencia.Errores.NoExisteOpcion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Crear Coche");
            System.out.println("2. Crear Moto");
            System.out.println("3. Elementos Creados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese la marca del coche: ");
                    String marcaCoche = scanner.nextLine();
                    System.out.print("Ingrese el modelo del coche: ");
                    String modeloCoche = scanner.nextLine();
                    System.out.print("Ingrese el año del coche: ");
                    String añoCoche = scanner.nextLine();
                    System.out.print("Ingrese el número de puertas del coche: ");
                    int numeroPuertas = Integer.parseInt(scanner.nextLine());
                    Vehiculo carro1 = new Coche(marcaCoche, modeloCoche, añoCoche, numeroPuertas);
                    System.out.println(carro1);

                    vehiculos.add(carro1);
                    break;
                case "2":
                    System.out.print("Ingrese la marca de la moto: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.print("Ingrese el modelo de la moto: ");
                    String modeloMoto = scanner.nextLine();
                    System.out.print("Ingrese el año de la moto: ");
                    String añoMoto = scanner.nextLine();
                    try {
                        Vehiculo moto1 = new Moto(marcaMoto, modeloMoto, añoMoto, "1");
                        vehiculos.add(moto1);
                        System.out.println(moto1);
                    } catch (NoExisteOpcion e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.println("------------------------------------");
                    System.out.println("Informacion de vehiculos");
                    //crea el for each
                    for(Vehiculo elementos: vehiculos){
                        if(elementos instanceof Coche){
                            System.out.println("COCHE");
                        }else {
                            System.out.println("MOTO");
                        }
                        System.out.println(elementos);
                        System.out.println();
                    }
                    System.out.println("------------------------------------");
                    break;
                case "4":
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println("_----------------------------_");
        }
        System.out.println("EJECUCION DEL PROGRAMA TERMINADO...");
    }
}