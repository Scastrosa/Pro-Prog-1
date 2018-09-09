package modelo;

public class Mundo 
{
	private EscYLee e;
	
	public Mundo()
	{
		e = new EscYLee();
		e.escribirPropiedades();
		e.leerPropiedades();
	}
}