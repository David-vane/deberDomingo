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
public class calculadora_de_limite_de_credito_4_18 {

    public static void main(String[] args) {

        int número_de_cuenta
;
        int saldo;
        int totalItems; // stores the total of all items charged by the customer this month 

        int creditos_totales;
        int limite_de_credito_permitido;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esta aplicación determina si alguno de varios " + "Grandes_almacenes \nLos clientes han superado el límite de crédito en una cuenta de cargo.\n");
        System.out.println("ingrese \"Numero de cuenta del cliente\": ");
        número_de_cuenta = entrada.nextInt();
        System.out.println();
        
        System.out.println("Ingrese \"Balanza de clientes\" al comienzo del mes: ");
        saldo = entrada.nextInt();
        System.out.println();
        System.out.println("ingrese \"TOTAL DE TODOS LOS ARTÍCULOS CARGADOS \\ \"por el Cliente este mes: ");
        totalItems = entrada.nextInt();
        System.out.println();
        System.out.println("Ingrese \\ \"TOTAL DE TODOS LOS CRÉDITOS APLICADOS \\\" al Cliente este mes: ");
        creditos_totales = entrada.nextInt();
        System.out.println();
        System.out.println("Ingrese el \\ \"LÍMITE DE CRÉDITO PERMITIDO \\\" del Cliente: ");
        limite_de_credito_permitido = entrada.nextInt();
        System.out.println();
        int nuevo_saldo = saldo + totalItems - creditos_totales;
        System.out.println("Cliente: " + número_de_cuenta + "\n" + "Saldo al inicio del mes: " + saldo + "\n" + "Número total de artículos cargados este mes: " + totalItems + "\n" + "Número total de créditos aplicados este mes: " + creditos_totales + "\n");
        System.out.println("El nuevo saldo del cliente es " + nuevo_saldo);
        System.out.println();
        if (nuevo_saldo < limite_de_credito_permitido) {
            System.out.println("Límite de crédito superado");
        }
        System.out.println();
    }
}
