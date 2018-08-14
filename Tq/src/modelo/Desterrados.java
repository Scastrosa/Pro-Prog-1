package modelo;

public class Desterrados extends KublaKan
{
	private String nombre;
	public Desterrados(String pColorOjos, int pEdad, double pEstatura, boolean pAlma, String pNombre) 
	{
		super(pColorOjos, pEdad, pEstatura, pAlma);
		this.nombre = pNombre;
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public void arrastrar()
	{
		System.out.println("Yo me arrastro de un lugar a otro.");
	}
	
	public void habitarPlaneta() 
	{
		System.out.println("Habitamos en el extremo Sur del planeta.");
	}

	public void sentir() 
	{
		System.out.println("No sentimos a nadie mas que a nosotros mismos.");
	}
	
	public void actual2()
	{
		System.out.println("Mi nombre es " + this.getNombre() + "."); 
		System.out.println("Yo vivo exactamente " + super.getEdad() + " años.");
		System.out.println("Yo mido " + super.getEstatura() + " metros.");
		System.out.println("Mis ojos son color " + super.getColorOjos() + ".");
		System.out.println("Mi alma es " + super.getAlma() + ".");
	}
}