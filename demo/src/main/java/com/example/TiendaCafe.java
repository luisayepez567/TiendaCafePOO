package com.example;

public class TiendaCafe {
    public static void main(String[] args) {
        cafe cafe1 = new cafe("Nescafe", "Quindio", 5450, 500);
        cafe cafe2 = new cafe("Juan Valdez", "Risaralda", 7500, 700);
        cafe cafe3 = new cafe("Buen dia", "Antioquia", 6250, 400);   
    
        cafe1.mostrarInformacion();
        System.out.println("El total es:" + cafe1.calcularPrecioTotal(cafe1.precioPorKilo, cafe1.cantidadEnKilos));
        cafe2.mostrarInformacion();
        System.out.println("El total es:" + cafe2.calcularPrecioTotal(cafe2.precioPorKilo, cafe2.cantidadEnKilos));
        cafe3.mostrarInformacion();
        System.out.println("El total es:" + cafe3.calcularPrecioTotal(cafe3.precioPorKilo, cafe3.cantidadEnKilos));

        cafe1.cantidadEnKilos = cafe1.actualizarCantidad(5000);

        System.out.println("Nuevo calculo");
        cafe1.mostrarInformacion();
        System.out.println("El total es:" + cafe1.calcularPrecioTotal(cafe1.precioPorKilo, cafe1.cantidadEnKilos));
    
    
    }
}