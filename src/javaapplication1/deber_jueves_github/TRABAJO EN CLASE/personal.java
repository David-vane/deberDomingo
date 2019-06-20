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
public class personal {
    private int decircosto;
    private String decirmodelo;
    private String decirmarca;
    private String decirbeneficios;
    private String llenarregistro;
    private int capacidadpersonas;
    private boolean camionetaoauto;
    private double costo;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("el carro tiene buenos beneficios como: ");
    }
    public void leerInformacion(){
        System.out.println("el carro esta estable y estas son las caracteristicas");
    }
    public void imprimirInformcaion(String info){
        System.out.println(info);
    }
    public static void main(String[] args) {
        personal primerobjeto=new personal();//he creado mi primer objeto
        primerobjeto.guardarInformacion();// llama a un objeto
        primerobjeto.leerInformacion();
        primerobjeto.imprimirInformcaion("le gustaria alquilarlo");
        primerobjeto.imprimirInformcaion("no le gustaria alquilarlo");
        
}
}
