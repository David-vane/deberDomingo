/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.deberes_prueba;



/**
 *
 * @author Robin
 */
public class imprimir_del_1_al_100 {
    public static void main (String[] args){
        int multiplo=0, numero=0;
        System.out.println("los numeros del 1 al 100 excepto los multiplos de 7");
        for(int a=1; a<=100; a++){
            int b=0;
            if(a%7==0){
                multiplo++;
            }else{
                if (a%2==0 || a%3==0){
                    System.out.println(""+a+"");
                    
                }
            }
                
        }
          System.out.println("en total hay "+multiplo);  
    }
}
