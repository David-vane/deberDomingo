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
public class clasificacion_de_numeros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrase los 5 numeros");
        int a,b,c,d,e;
        a=entrada.nextInt();
        b=entrada.nextInt();
        c=entrada.nextInt();
        d=entrada.nextInt();
        e=entrada.nextInt();
      if(a==0){
      System.out.println("El numero "+a+" es nulo o cero");
      } else{
          if(a>0){
              System.out.println("El numero "+a+" es positivo");
          }else{
          System.out.println("El numero "+a+" es negativo");
          }
      } 
      if(b==0){
      System.out.println("El numero "+b+" es nulo o cero");
      } else{
          if(b>0){
              System.out.println("El numero "+b+" es positivo");
          }else{
          System.out.println("El numero "+b+" es negativo");
          }
      }
      if(c==0){
      System.out.println("El numero "+c+" es nulo o cero");
      } else{
          if(c>0){
              System.out.println("El numero "+c+" es positivo");
          }else{
          System.out.println("El numero "+c+" es negativo");
          }
      }
      if(d==0){
      System.out.println("El numero "+d+" es nulo o cero");
      } else{
          if(d>0){
              System.out.println("El numero "+d+" es positivo");
          }else{
          System.out.println("El numero "+d+" es negativo");
          }
      } 
      if(e==0){
      System.out.println("El numero "+e+" es nulo");
      } else{
          if(e>0){
              System.out.println("El numero "+e+" es positivo");
          }else{
          System.out.println("El numero "+e+" es negativo");
          }
      } 
      
      }
}
