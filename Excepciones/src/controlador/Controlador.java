package controlador;

import modelo.Mundo;
import modelo.OlvidoInstanciarLaExcepcion;

public class Controlador 
{
	private Mundo m;

	public Controlador() throws OlvidoInstanciarLaExcepcion
	{
		hacerDivision();
	}

	public void hacerDivision() throws OlvidoInstanciarLaExcepcion
	{
		int a = 2;
		m = new Mundo();
		m.dividir(5);
		if( a == 1) 
		{
			throw new OlvidoInstanciarLaExcepcion();
		}
		else 
		{
			System.out.println("Error");
		}
	}
}