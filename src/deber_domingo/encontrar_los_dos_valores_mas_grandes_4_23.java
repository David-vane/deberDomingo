package deber_domingo;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class encontrar_los_dos_valores_mas_grandes_4_23 {
    public void calcularGrandes() {
        int contador = 0;
        int numero = 0;
        int mayor = 0;
        int segundoMayor = 0;

        Scanner entrada = new Scanner(System.in);

        while (contador < 10) {
            System.out.print("\nDame un entero: ");
            numero = entrada.nextInt();
            if (numero > mayor) {
                segundoMayor = mayor;
                mayor = numero;
            } else if (numero > segundoMayor) {
                segundoMayor = numero;
            }
            contador++;
        }

        System.out.println("\nEl entero más grande es: " + mayor + " y el segundo más grande es: " + segundoMayor);
    }

    public static void main(String[] args) {

        encontrar_los_dos_valores_mas_grandes_4_23 dosMasGrandes = new encontrar_los_dos_valores_mas_grandes_4_23();
        dosMasGrandes.calcularGrandes();
    }
}
