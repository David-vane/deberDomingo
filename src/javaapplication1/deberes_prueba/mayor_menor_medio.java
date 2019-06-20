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
public class mayor_menor_medio {
    public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		System.out.println("ingresar valores");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		if (n1>n2 && n1>n3) {
			System.out.println("mayor ;"+n1);
			
		} else {
			if (n2>n3 && n2>n1) {
				System.out.println("mayor ;"+n2);
				
			} else {
				if (n3>n1 && n3>n2) {
					System.out.println("mayor ;"+n3);
					
				}
			}
		}
		if (n1<n2 && n1<n3) {
			System.out.println("menor ;"+n1);
		} else {
			if (n2<n3 && n2<n1) {
				System.out.println("menor ;"+n2);
			} else {
				if (n3<n1 && n3<n2) {
					System.out.println("menor ;"+n3);
				}
			}
		}
		if (n1>n2 && n1<n3) {
			System.out.println("medio ;"+n1);
		} else {
			if (n1>n3 && n1<n2) {
				System.out.println("medio ;"+n1);
			} else {
				if (n2>n3 && n2<n1) {
					System.out.println("medio ;"+n2);
				} else {
					if (n2>n1 && n2<n3) {
						System.out.println("medio :"+n2);
					} else {
						if (n3>n2 && n3<n1) {
							System.out.println("medio :"+n3);
						} else {
							if (n3>n1 && n3<n2) {
								System.out.println("medio :"+n3);
							}
						}
					}
				}
			}
		}
	}
}
