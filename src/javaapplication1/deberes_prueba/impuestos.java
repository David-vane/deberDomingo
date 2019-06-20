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
public class impuestos {
    public static void main (String[] args){
            Scanner entrada=new Scanner(System.in);
            int salario;
            salario=entrada.nextInt();
            if (salario>400 && salario<=1300){
                System.out.println("debe pagar impuestos: ");
            }else{
                if(salario<400){
                    System.out.println("no paga impuestos: ");
                }
            }
    }            
}
