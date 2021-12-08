/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        String cadena = "";
        String cadena2 = "";
        String cadena3 = "";
        
        
        for (int i = 1; i <= 10; i++) { // for 01
            cadena = String.format("%sTabla de multiplicar del número %d\n",cadena, i);
            
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                cadena = String.format("%s%d x %d = %d\n", cadena, i, contador, operacion);
             
              
             
            }
            
            
        }
        System.out.printf("%s%s\n", cadena, cadena2);
    }
}
