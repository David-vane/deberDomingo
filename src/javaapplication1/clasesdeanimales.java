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
public class clasesdeanimales {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String animal;
        System.out.println("ingrese un animal");
        animal = entrada.nextLine();
        if (animal.equals("tigre") || animal.equals("leon") || animal.equals("leopardo")) {
            System.out.println("es un animal carnivoro");
        } else {
            if (animal.equals("vaca") || animal.equals("jirafa") || animal.equals("caballo")) {
                System.out.println("es un animal herbivoro");
            } else {
                if (animal.equals("perro") || animal.equals("gato") || animal.equals("cerdo")) {
                    System.out.println("es un  animal omnivoro");
                } else {
                    if (animal.equals("oso hormiguero") || animal.equals("rana")) {
                        System.out.println("es un animal insectivoro");
                    } else {
                        System.out.println("ingrese un animal de la lista");
                    }

                }
            }
        }
    }
}
