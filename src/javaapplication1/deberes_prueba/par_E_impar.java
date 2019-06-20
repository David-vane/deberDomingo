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
public class par_E_impar {
    public static void main(String[] args)  {
		Scanner entrada = new Scanner(System.in);
		int i , m ,n , pares=0, impares=0;
		System.out.println("ingresar cantidad de numeros a evaluar");
		n = entrada.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println("ingrese el valor "+i+" a evaluar");
			m = entrada.nextInt();
			if (m%2==0) {
				pares = pares+1;
			} else {
				impares = impares+1;
			}
		}
		System.out.println("la cantidad de numeros pares que hay son "+pares);
		System.out.println("la cantidad de numeros impares que hay son "+impares);
	}

}
