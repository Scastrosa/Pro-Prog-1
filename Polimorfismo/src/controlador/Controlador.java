package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo m;
	private Interfaz i;
	
	public Controlador()
	{
		i = new Interfaz();
		m = new Mundo();
		
		i.mostrarDatos(m.hacerSobrecarga());
		i.mostrarDatos1(m.hacerSobrecarga1(i.ingresarArgumento()));
		i.mostrarDatos2(m.hacerSobrecarga2(i.ingresarArgumento(), i.ingresarArgumento2()));
	}
}