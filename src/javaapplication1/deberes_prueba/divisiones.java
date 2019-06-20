/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.deberes_prueba;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class divisiones {
    public static void main(String args[]) throws IOException {
		Scanner entrada = new Scanner (System.in);
		int i;
		double n;
		double valor;
		System.out.println("digite un numero");
		n = entrada.nextDouble();
		System.out.println("tabla de dividir:"+n);
		for (i=1;i<=n;i++) {
			valor = n/i;
			System.out.println(n+"/"+i+"="+valor);
		}
	}


}
