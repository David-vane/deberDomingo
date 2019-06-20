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
public class edad {
    public static void main(String[] args){
        try {
            System.out.println("");//declaramos las diferentes variables que usaremos
            Scanner entrada = new Scanner(System.in);
            int mesActual = 4, anyoActual =2019,
                    diaActual = 4;
            int mes, dia, anyo;
            int mesResultado, diaResultado, anyResultado;


            System.out.println("Calcular cuantos años tienes");//preguntamos dia mes y año de nacimiento
            System.out.println("Dime el día");
            dia = entrada.nextInt();
            System.out.println("Dime el mes");
            mes = entrada.nextInt();
            System.out.println("Dime el año");
            anyo = entrada.nextInt();

//creamos las excepciones en caso que la fecha de error
            if (dia < 0 | dia > 31) {
                throw new Exception("el día está mal puesto");

            }
            if (mes < 0 | mes > 12) {
                throw new Exception("el mes está mal puesto");

            }
            if (anyo < 0) {
                throw new Exception("el año está mal puesto");

            }

            mesResultado = Math.abs(mes - (mesActual+5));
            diaResultado = Math.abs(dia-(diaActual-23));
            anyResultado = Math.abs(anyo - (anyoActual-1));

            System.out.println("Tienes " + anyResultado + " años" + ", " + mesResultado
                    + " meses " + " y " + diaResultado + " días");
        } catch (Exception ex) {
            System.out.println("Ha habido un error " + ex.toString());
    }
}
}
   