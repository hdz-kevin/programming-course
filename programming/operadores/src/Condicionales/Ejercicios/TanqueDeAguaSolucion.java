package Condicionales.Ejercicios;

public class TanqueDeAguaSolucion {

    /**
     * Llenado automático de Tanque de Agua 
     * 
     * Crea un programa que reciba la capacidad del tanque y la cantidad de agua actual.
     * Calcula el porcentaje de agua en el tanque.
     * 
     * Formula del porcentaje:
     *      aguaActual * 100 / capacidad
     * 
     * Si el porcentaje de agua es menor al 30%, imprime:
     *      "Llenando Tanque..."
     * 
     * De lo contrario, imprime:
     *      "Tanque Lleno"
     * 
     */

    public static void main(String[] args) {
        double capacidad = 1000; 
        double aguaActual = 255; 
        double porcentaje = aguaActual * 100 / capacidad;
        System.out.println(porcentaje);


        if (porcentaje < 30) {
            System.out.println("Llenando Tanque");
        } else {
            System.out.println("Tanque Lleno");
        }        
    }
    
}
