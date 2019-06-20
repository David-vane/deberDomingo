/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.deber_jueves_github;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class diametro_circunferencia_y_area_de_un_circulo {
    public static void main( String[] args ){
        int radio; 
        double diametro, circunferencia, area;
        Scanner entrada = new Scanner( System.in );
        System.out.print( "Digite el radio del círculo: ");
        radio = entrada.nextInt();
        diametro=2*radio;
        System.out.println("El diametro del círculo es: " + diametro );
        circunferencia=2*Math.PI*radio;
        System.out.println( "La circunferencia del círculo es: "+ circunferencia );
        area=Math.PI*radio*radio;
        System.out.println( "El área del círculo es: "+ area );
    } 
}
