/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO.deber.deber2;

import java.util.Scanner;

/**
 *
 * @author ITS LOJA
 */
public class demasteriscos {
     public static void main( String[] args ){
         Scanner entrada = new Scanner(System.in);
         System.out.println("ingrese el numero de columnas");
         int asteriscos;
         asteriscos = entrada.nextInt();
        System.out.println("zic zac");
 
		for(int i=0;i<asteriscos;i++)
		{
			for(int j=0;j<asteriscos;j++)
                            
			{
				System.out.println("* * * * * * * *");
		                System.out.println(" * * * * * * * *");
			}
                        System.out.println("\n");
}
                
	}
     }