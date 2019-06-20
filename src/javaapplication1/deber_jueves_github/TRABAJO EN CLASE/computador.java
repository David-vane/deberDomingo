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
public class computador {
    //declaro mis atributos
    private int año;
    private String modelo;
    private String marca;
    private double capacidadprocesador;
    private boolean portatil;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("Hola soy la computadora y guardo informacion");
    }
    public void leerInformacion(){
        System.out.println("Hola soy la computadora y guardo la informacion");
    }
    public void imprimirInformcaion(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        computador primerobjeto=new computador();//he creado mi primer objeto
        primerobjeto.guardarInformacion();// llama a un objeto
        primerobjeto.imprimirInformcaion("HOLA");
        primerobjeto.imprimirInformcaion("CHAO");
        
    }
}
