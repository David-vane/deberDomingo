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
public class validar_entrada_del_usuario_4_24 {
    public static void main(String[] args) {

		validar_entrada_del_usuario_4_24 ejemplo = new validar_entrada_del_usuario_4_24();

		// # Realizando validaciones a un numero

		// Numero con un espacio
		System.out.println(ejemplo.validar(" 123456"));
		// Numero con un caracter especial (punto)
		System.out.println(ejemplo.validar("12.3456"));
		// Con un caracter especial (coma)
		System.out.println(ejemplo.validar("10,0001"));
		// Numero valido
		System.out.println(ejemplo.validar("3465756"));
		// Numero con una letra (A)
		System.out.println(ejemplo.validar("10000A"));
		// Cadena vacia
		System.out.println(ejemplo.validar(""));

		// # Eliminando caracteres no correspondientes a un numero

		// Numero con un espacio
		System.out.println(ejemplo.convertir(" 123456"));
		// Numero con un caracter especial (punto)
		System.out.println(ejemplo.convertir("12.3456"));
		// Con un caracter especial (coma)
		System.out.println(ejemplo.convertir("10,0001"));
		// Numero valido
		System.out.println(ejemplo.convertir("3465756"));
		// Numero con una letra (A)
		System.out.println(ejemplo.convertir("10000A"));
		// Cadena vacia
		System.out.println(ejemplo.convertir(""));

	}

	public boolean validar(String cadena) {
		if (cadena.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}

	public int convertir(String numero) {
		// Se reemplazan todos los caracteres que no correspondan a un numero
		// por espacio
		numero = numero.replaceAll("[^0-9]", "");

		// Si la cadena queda vacia
		if (numero.equals("")) {
			numero = "0";
		}

		return Integer.parseInt(numero);
	}
}
