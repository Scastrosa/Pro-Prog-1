package controlador;

import javax.swing.JLabel;

import modelo.Credito;
import vista.Interfaz;

public class Controlador 
{
	private Credito credito;
	private Interfaz interfaz;
	
	public Controlador()
	{
		interfaz = new Interfaz();
		credito = new Credito(interfaz.ingresarPeriodo(), interfaz.ingresarInteres(), interfaz.ingresarInversion());
		interfaz.imprimirDatos(credito.getTasaEfec()*100, credito.getValorAnual(), credito.getValorCuota());	
	}
}
