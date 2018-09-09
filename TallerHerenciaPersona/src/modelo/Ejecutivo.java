package modelo;

public class Ejecutivo extends Gerente
{
	private String gestion;
	private int numeroOficina;
	
	public Ejecutivo(String pNombre, int pEdad, double pSalario, String pCargo, int pPersonasCargo, int pCitas, String pGestion, int pNumeroOficina) 
	{
		super(pNombre, pEdad, pSalario, pCargo, pPersonasCargo, pCitas);
		this.gestion = pGestion;
		this.numeroOficina = pNumeroOficina;
	}

	public int getNumeroOficina() 
	{
		return numeroOficina;
	}

	public void setNumeroOficina(int numeroOficina) 
	{
		this.numeroOficina = numeroOficina;
	}

	public String getGestion() 
	{
		return gestion;
	}

	public void setGestion(String gestion) 
	{
		this.gestion = gestion;
	}
	
	public void coordinar()
	{
		System.out.println("Soy el encargado de coordinar las actividades de la empresa.");
	}
	
	public void actualizar3()
	{
	System.out.println("Mi nombre es " + super.getNombre() + ".");
	System.out.println("Mi edad es de " + super.getEdad() + " años.");
	System.out.println("Mi cargo es " + super.getCargo() + ".");
	System.out.println("Mi salario mensual es de " + super.getSalario() + " pesos.");
	System.out.println("La gestion que realizo es " + this.gestion + ".");
	System.out.println("Mi numero de oficina es " + this.numeroOficina + ".");
	}
}