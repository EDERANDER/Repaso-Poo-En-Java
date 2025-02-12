package com.alura.qConsumoApi;

public class Conversor {
   private String nombreMonedaBase;
   private double cantidadMonedaBase;
   private String nombreMonedaConvertir;
   public Double resultado;

    public Conversor(DtoConversor dto){
        this.nombreMonedaBase = dto.base_code();
        this.nombreMonedaConvertir = dto.target_code();
        this.resultado = Double.valueOf(dto.conversion_result());
    }

    public double getCantidadMonedaBase() {
        return cantidadMonedaBase;
    }

    public void setCantidadMonedaBase(double cantidadMonedaBase) {
        this.cantidadMonedaBase = cantidadMonedaBase;
    }


}
