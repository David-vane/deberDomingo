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
public class leer_10_numeros {
public static void main(String[] args){
int acumulador=0;
int numero;
Scanner entrada=new Scanner(System.in);
for(int c=1;c<=10;c++){
System.out.println("Teclea los números: ");
numero=entrada.nextInt();
if (numero>=1){
    System.out.println("este es positivo: " + numero);
}else{
    if (numero <0){
        System.out.println("este es negativo: " + numero);
    }else{
        if (numero==0){
            System.out.println("este es cero: " + numero);
        }
    }
}
}
}
}

