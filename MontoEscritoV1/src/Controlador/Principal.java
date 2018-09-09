package Controlador;

import javax.swing.JOptionPane;
import Modelo.Numero;
import Modelo.Persistencia;

public class Principal {

	//Atributos que vienen del Modelo 
	static Persistencia data; 
	static Numero numero; 
	
	/*
	 * Metodo main(), punto de entrada a la ejecución de la aplicación
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numero = new Numero();
		data = new Persistencia();
		numero.solicitarNumero();
		numero.calcularMonto();
		numero.imprimirMonto();
	}	
}
