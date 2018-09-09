package modelo;

public class Comercial extends Gerente
{
	private String gestionCobranza;
	private int numeroVentas;
	
	public Comercial(String pNombre, int pEdad, double pSalario, String pCargo, int pPersonasCargo, int pCitas, String pGestionCobranza, int pNumeroVentas) 
	{
		super(pNombre, pEdad, pSalario, pCargo, pPersonasCargo, pCitas);
		this.gestionCobranza = pGestionCobranza;
		this.numeroVentas = pNumeroVentas;
	}

	public String getGestionCobranza() 
	{
		return gestionCobranza;
	}

	public void setGestionCobranza(String gestionCobranza) 
	{
		this.gestionCobranza = gestionCobranza;
	}
	
	public int getNumeroVentas() 
	{
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) 
	{
		this.numeroVentas = numeroVentas;
	}
	
	public void dirigir()
	{
		System.out.println("Soy el encargado de dirigir el departamento de comercializacion.");
	}

	public void actualizar4()
	{
	System.out.println("Mi nombre es " + super.getNombre() + ".");
	System.out.println("Mi edad es de " + super.getEdad() + " años.");
	System.out.println("Mi cargo es " + super.getCargo() + ".");
	System.out.println("Mi salario mensual es de " + super.getSalario() + " pesos.");
	System.out.println("La gestion que realizo es de " + this.gestionCobranza + ".");
	System.out.println("El numero de ventas diarias es de " + this.numeroVentas + ".");
	}
}