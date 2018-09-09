package modelo;

public class Mantenimiento extends Empleado
{
	public Mantenimiento(String pNombre, int pEdad, double pSalario, String pCargo, int pArticulosRestaurados, int pHorasLaboradas) 
	{
		super(pNombre, pEdad, pSalario, pCargo);
		this.articulosRestaurados = pArticulosRestaurados;
		this.horasLaboradas = pHorasLaboradas;
	}

	private int articulosRestaurados;
	private int horasLaboradas;

	public int getArticulosRestaurados() 
	{
		return articulosRestaurados;
	}

	public void setArticulosRestaurados(int articulosRestaurados) 
	{
		this.articulosRestaurados = articulosRestaurados;
	}

	public int getHorasLaboradas() 
	{
		return horasLaboradas;
	}

	public void setHorasLaboradas(int horasLaboradas) 
	{
		this.horasLaboradas = horasLaboradas;
	}
	
	public void restaurar()
	{
		System.out.println("Soy el encargado de restaurar los objetos averiados.");
	}
	
	public void actualizar1()
	{
		System.out.println("Mi nombre es " + super.getNombre() + ".");
		System.out.println("Mi edad es de " + super.getEdad() + " años.");
		System.out.println("Mi cargo es " + super.getCargo() + ".");
		System.out.println("Mi salario mensual es de " + super.getSalario() + " pesos.");
		System.out.println("Los articulos restaurados son " + this.articulosRestaurados + ".");
		System.out.println("Las horas laboradas son " + this.horasLaboradas + ".");
	}
}