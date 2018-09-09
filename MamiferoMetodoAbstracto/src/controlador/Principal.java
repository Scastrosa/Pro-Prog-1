package controlador;

import modelo.Mundo;

public class Principal 
{	
	private static Mundo m;
	
	public static void main(String[] args) 
	{
		m = new Mundo();
		m.getCan1().alimentar();
		m.getCan1().hacerSonido();
		System.out.println("");
		m.getFel1().alimentar();
		m.getFel1().hacerSonido();
	}
}