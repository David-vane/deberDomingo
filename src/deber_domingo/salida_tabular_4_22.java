/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_domingo;

/**
 *
 * @author Robin
 */
public class salida_tabular_4_22 {
    public void imprimirTabla() {
        int contador = 1;
        System.out.println("N     10*N   100*N   1000*N");
        while (contador <= 5) {
            System.out.printf("%d     %d     %d     %d\n",
                    contador, contador*10, contador*100, contador*1000);
            contador++;
        }
    }
    public static void main(String[] args) {
        salida_tabular_4_22 tabla = new salida_tabular_4_22();
        tabla.imprimirTabla();
    }
}
