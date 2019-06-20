/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class PRIMOS {

    public static void main(String[] args) {
        System.out.println("Ingrese el Numero: ");
        int valor;
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextInt();
        int inicio = 0;
        int fin = 1;
        while (fin <= valor) {
            if (valor % fin == 0) {
                inicio = inicio + 1;
            }

            fin = fin + 1;
        }
        if (inicio == 2) {
            System.out.println(" es un numero primo");
        } else {
            System.out.println("no es un numero primo");
        }

    }
    }
    
