package com.alura.ProgramaManejoExcepciones.Principal;

import com.alura.ProgramaManejoExcepciones.ExcepcionesPersonalisadas.NoSePuedeDividirEntreCero;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Idioma: " + Locale.getDefault());

        String menu = """
                      
                  
                      |1| sumar
                      |2| restar
                      |3| multiplicar
                      |4| dividir
                      |5| salir
                      
                      ingrese opcion:
                      """;
        while (true){
            System.out.println(menu);
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:{
                    System.out.println("SUMAR:");


                    double a = scanner.nextDouble();
                    scanner.nextLine();
                    double b = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("La suma es: " + calculadora.sumar(a,b));

                }
                break;

                case 2:{
                    System.out.println("RESTAR:");
                    double a = scanner.nextDouble();
                    scanner.nextLine();

                    double b = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("La suma es: " + calculadora.restar(a,b));
                }
                break;
                case 3:{
                    System.out.println("MULTIPLICAR:");
                    double a = scanner.nextDouble();
                    scanner.nextLine();

                    double b = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println(calculadora.multiplicar(a,b));


                }
                break;

                case 4:{
                    System.out.println("DIVIDIR:");
                    double a = scanner.nextDouble();
                    scanner.nextLine();

                    double b = scanner.nextDouble();
                    scanner.nextLine();
                    try{
                        System.out.println(calculadora.dividir(a,b));
                    }catch (NoSePuedeDividirEntreCero e){
                        System.out.println(e.getMessage());
                    }
                }
                break;
                default:
            }
        }
    }
}
