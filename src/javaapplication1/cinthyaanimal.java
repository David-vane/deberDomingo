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
public class cinthyaanimal {
     public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String P;
        System.out.println("ingrese un animal");
        P = entrada.nextLine();
        if (P.equals("lagarto") || P.equals("iguana") || P.equals("serpiente") || P.equals("camaleon")) {
            System.out.println("reino animal reptiles");
        } else {
            if (P.equals("delfin") || P.equals("ser humano") || P.equals("canguro") ) {
                System.out.println("reino animal mamifero");
            } else {
                if (P.equals("gallina") || P.equals("avestruz") || P.equals("palomas") || P.equals("condor") || P.equals("patos")) {
                    System.out.println("reino ave");
                } else {
                    if (P.equals("atun") || P.equals("corvina") || P.equals("bagre")) {
                        System.out.println("Reino animal peces");
                    } else {
                        System.out.println("ingrese un animal de la lista");
                    }

                }
            }
        }
    }
}
