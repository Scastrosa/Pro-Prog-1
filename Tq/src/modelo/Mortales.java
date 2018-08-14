package modelo;

public class Mortales extends KublaKan
{
	private String nombre;

	public Mortales(String pColorOjos, int pEdad, double pEstatura, boolean pAlma, String pNombre) 
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

	public void adquirirConocimiento()
	{
		System.out.println("Adquiero el conocimiento mediante los libros.");
	}

	public void tenerFamilia()
	{
		System.out.println("Tengo 3 hijos junto a mi esposa.");
	}

	public void ejercerProfesion()
	{
		System.out.println("Yo trabajo por el planeta.");
	}

	public void habitarPlaneta() 
	{
		System.out.println("Habitamos en el Este del planeta.");
	}

	public void sentir() 
	{
		System.out.println("Podemos sentir la presencia de tros mortales.");
	}

	public void actual3()
	{
		System.out.println("Mi nombre es " + this.getNombre() + "."); 
		System.out.println("Mi edad es de " + super.getEdad() + " años.");
		System.out.println("Yo mido " + super.getEstatura() + " metros.");
		System.out.println("Mis ojos son color " + super.getColorOjos() + ".");
		System.out.println("Mi alma es " + super.getAlma() + ".");
	}
}