/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.deberes_prueba;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class multiplos_de_un_numero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int l ;
        int n;
        System.out.println("ingrese el numero: ");
        n = entrada.nextInt();
        System.out.println("ingrese el limite: ");
        l = entrada.nextInt();
        int i =0;
        for (i = n; i < (n*l); i+=n)
            System.out.println("los multiplos son: "+i+",");
            
            
        }
    }

