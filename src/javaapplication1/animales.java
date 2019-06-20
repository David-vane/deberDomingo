/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class animales {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String animal;
        System.out.println("ingrese un animal");
        animal = entrada.nextLine();
        if (animal.equals("gallina") || animal.equals("papagallo") || animal.equals("avestruz") || animal.equals("palomas")) {
            System.out.println("pertenece a las aves");
        } else {
            if (animal.equals("perro") || animal.equals("vaca") || animal.equals("mono") || animal.equals("leon")) {
                System.out.println("pertenece a los mamiferos");
            } else {
                if (animal.equals("rana") || animal.equals("serpiente") || animal.equals("cocodrilo") || animal.equals("lagarto") || animal.equals("iguana")) {
                    System.out.println("pertenece a los reptiles");
                } else {
                    if (animal.equals("atun") || animal.equals("corvina") || animal.equals("tiburon")) {
                        System.out.println("pertenece a los peces");
                    } else {
                        System.out.println("ingrese un animal de la lista");
                    }

                }
            }
        }
    }
}
