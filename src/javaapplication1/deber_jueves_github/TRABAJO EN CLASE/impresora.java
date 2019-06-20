/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEGUNDO_CICLO;

/**
 *
 * @author ITS LOJA
 */
public class impresora {
    private int año;
    private String modelo;
    private String marca;
    private double capacidaddeimpresion;
    private boolean portatil;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("vamos a imprimir este documento no desea cambiarlo");
    }
    public void leerInformacion(){
        System.out.println("imprimiendo la informacion dada");
    }
    public void imprimirInformcaion(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        impresora primerobjeto=new impresora();//he creado mi primer objeto
        primerobjeto.guardarInformacion();// llama a un objeto
        primerobjeto.imprimirInformcaion("imprimiendo");
        primerobjeto.imprimirInformcaion("fallo la impresion");
        
    }
}
