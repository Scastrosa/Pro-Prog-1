package modelo;

public abstract class Airplane extends Vehicle implements Flyer
{
	protected String tipoMotores;
	
	public abstract String funcionamiento();
}