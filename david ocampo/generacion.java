/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.ocampo.deber;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class deber {

    public static void main(String[] args) {
        int numero1;
        Scanner entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();
        if (numero1 >= 1994 && numero1 <= 2010) {
            System.out.println("Generacion Z");
        } else {
            if (numero1 >= 1981 && numero1 <= 1993) {
                System.out.println("Generacion Y");
            } else {
                if (numero1 >= 1969 && numero1 <= 1980) {
                    System.out.println("Generacion X");
                } else {
                    if (numero1 >= 1949 && numero1 <= 1968) {
                        System.out.println("baby boom");
                    } else {
                        if (numero1 >= 1930 && numero1 <= 1948) {
                            System.out.println("silent generation - los niños de la posguerra");
                        }
                    }
                }
            }
        }

    }
}
