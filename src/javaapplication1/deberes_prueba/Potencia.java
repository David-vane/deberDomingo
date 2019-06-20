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

   public class Potencia { 
   public static void main (String args[]){ 
      Scanner entrada = new Scanner(System.in); 
      int base, exp, res, i; 
      System.out.println ("ingrese la base"); 
      base = entrada.nextInt(); 
      System.out.println ("ingrese la potencia"); 
      exp = entrada.nextInt(); 
      res = base; 
      for (i= 1; i<exp; i++) { 
         res = res * base; 
      } 
      System.out.println ("El resultado es: "+res); 
   } 
} 
