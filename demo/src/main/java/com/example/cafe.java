package com.example;


// clase cafe
public class cafe {
    String nombre;
    String region;
    double precioPorKilo;
    double cantidadEnKilos;

    public cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos){
        this.nombre=nombre;
        this.region= region;
        this.precioPorKilo= precioPorKilo;
        this.cantidadEnKilos= cantidadEnKilos;
    }

    void mostrarInformacion (){
        System.out.println("Información del café:");
        System.out.println(nombre);
        System.out.println(region);
        System.out.println(precioPorKilo);
        System.out.println(cantidadEnKilos);
    }

    double calcularPrecioTotal (double precioPorKilo, double cantidadEnKilos) {
            return precioPorKilo*cantidadEnKilos;
    }

    double actualizarCantidad (double nuevaCantidad) {
            return nuevaCantidad;
}
  }
