/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class NewClass {

   public static void main(String[] args)  {
        System.out.println("Ingrese el Numero: ");
        int num;
        int d=0;
        int i=1;
        Scanner entrada= new Scanner (System.in);
        num = entrada.nextInt();
        while(i==num)
        {
             if (num%i==0)
             {
               d=d+1;  
             }
                
            i=i+1;
        }           
        if(d==2)
        {
        System.out.println("primo");
        }
        else
        {
            System.out.println("no es primo");
        }
         
      }   
    }
