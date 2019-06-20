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
public class carro {
     //declaro mis atributos
    private int año;
    private String modelo;
    private String marca;
    private int capacidadpersonas;
    private boolean camioneta;
    private double costo;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("el carro tiene buena aceleracion");
    }
    public void leerInformacion(){
        System.out.println("el carro esta estable");
    }
    public void imprimirInformcaion(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        carro primerobjeto=new carro();//he creado mi primer objeto
        primerobjeto.guardarInformacion();// llama a un objeto
        primerobjeto.imprimirInformcaion("buen carro");
        primerobjeto.imprimirInformcaion("carro chino");
        
}
}
