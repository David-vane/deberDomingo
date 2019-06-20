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
public class cinthya {
    public static void main(String args[]) {
        System.out.println("ingrese el limite");
		int l ;
                int b=0;
                int j=0;
                Scanner entrada = new Scanner (System.in);
                l=entrada.nextInt();
		int i = 1;
		while (i<=l) {
			i = i+1;
			b = 0;
			for (j=1;j<=Math.floor(i/2);j++) {
				if (i%j==0) {
					b = b+j;
				}
			}
			if (b==i) {
				System.out.println("el numero " +i+ " es perfecto");
			}
		}
	}
}
