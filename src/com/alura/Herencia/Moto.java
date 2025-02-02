package com.alura.Herencia;
import com.alura.Herencia.Errores.NoExisteOpcion;

import java.util.Scanner;
public class Moto extends Vehiculo{

    private String tipoConbustible;
    public Moto(String marca, String modelo, String año, String tipoConbustible){
        super(marca, modelo, año);
        setTipoConbustible();
    }

    public void setTipoConbustible(){
        String mensaje = "Objeto creado";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 si es a gasolina y 2 si es a otrotipo");
        String opcion = scanner.nextLine();

        if(opcion.equals("1")){
            this.tipoConbustible = "gasolina";
            System.out.println(mensaje);

        }else if(opcion.equals("2")){
            this.tipoConbustible = "otro";
            System.out.println(mensaje);
        }
        else {
            throw new NoExisteOpcion("esa opcion no esta disponible");
        }
    }
    public String getTipoConbustible(){
        return this.tipoConbustible;
    }

    @Override
    public String toString(){
        return  "marca: " + super.getMarca() + "\n" +
                "modelo: " + super.getModelo() + "\n" +
                "año: " + super.getAño() + "\n" +
                "conbustible: " + getTipoConbustible();
    }
}
