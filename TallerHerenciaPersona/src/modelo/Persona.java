package modelo;

public class Persona 
{
	protected String nombre;
	protected int edad;
	
	public Persona(String pNombre, int pEdad)
	{
		this.nombre = pNombre;
		this.edad = pEdad;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	
	public void caminar()
	{
		System.out.println("Yo camino hacia el trabajo.");
	}
}