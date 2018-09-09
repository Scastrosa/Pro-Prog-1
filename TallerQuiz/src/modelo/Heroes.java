package modelo;

public class Heroes extends KublaKan
{
	private String nombre;

	public Heroes(String pColorOjos, int pEdad, double pEstatura, boolean pAlma, String pNombre) 
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

	public void volar()
	{
		System.out.println("Yo vuelo por los aires.");
	}

	public void crearFuego()
	{
		System.out.println("Yo creo el fuego con mis manos.");
	}

	public void detenerTiempo()
	{
		System.out.println("Dentengo el tiempo para apreciar los buenos momentos.");
	}

	public void habitarPlaneta() 
	{
		System.out.println("Habito al Norte del planeta.");
	}

	public void sentir() 
	{
		System.out.println("Nos sentimos a nosotros mismos y a seres de otros mundos.");
	}

	public void actual1()
	{
		System.out.println("Mi nombre es " + this.getNombre() + ".");
		System.out.println("Mi edad es de " + super.getEdad() + " años.");
		System.out.println("Yo mido " + super.getEstatura() + " metros.");
		System.out.println("Mis ojos son color " + super.getColorOjos() + ".");
		System.out.println("Mi alma es " + super.getAlma() + ".");
	}
}