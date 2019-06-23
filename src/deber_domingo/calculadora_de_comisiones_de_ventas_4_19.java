/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_domingo;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class calculadora_de_comisiones_de_ventas_4_19 {

    public static void main(String[] args) {
        double artUno = 0;
        double artDos = 0;
        double artTres = 0;
        double artCuatro = 0;
        double comisionSemanal = 200;
        double comisionVar = 0.09;
        double articulos = artUno + artDos + artTres + artCuatro;
        double totalIngresos;
        Scanner input = new Scanner(System.in);
        System.out.println("introduzca \"el articulo uno\": ");
        artUno = input.nextInt();
        artUno *= 239.99;
        System.out.println();
        System.out.println("introduzca \"el articulo dos\": ");
        artDos = input.nextInt();
        artDos *= 129.75;
        System.out.println();
        System.out.println("introduzca \"el articulo tres\": ");
        artTres = input.nextInt();
        artTres *= 99.95;
        System.out.println();
        System.out.println("introduzca \"el articulo cuatro\": ");
        artCuatro = input.nextInt();
        artCuatro *= 350.89;
        System.out.println();
        articulos = artUno + artDos + artTres + artCuatro;
        totalIngresos = comisionSemanal + (articulos * comisionVar);
        System.out.println("\n");
        System.out.printf("Your weekly commision is: %.2f\n", totalIngresos);
        System.out.println("\n");
    }
}
