package modelo;

public class Tecnologia extends Empleado
{
	private int tiempoDeGarantiaProducto;
	private String enfoque;
	
	public Tecnologia(String pNombre, int pEdad, double pSalario, String pCargo, int pTiempoDeGarantiaProducto, String pEnfoque) 
	{
		super(pNombre, pEdad, pSalario, pCargo);
		this.tiempoDeGarantiaProducto = pTiempoDeGarantiaProducto;
		this.enfoque = pEnfoque;
	}

	public int getTiempoDeGarantiaProducto() 
	{
		return tiempoDeGarantiaProducto;
	}

	public void setTiempoDeGarantiaProducto(int tiempoDeGarantiaProducto) 
	{
		this.tiempoDeGarantiaProducto = tiempoDeGarantiaProducto;
	}
	
	public String getEnfoque() 
	{
		return enfoque;
	}

	public void setEnfoque(String enfoque) 
	{
		this.enfoque = enfoque;
	}
	
	public void produccion()
	{
		System.out.println("Realizo la produccion de los problemas del mundo.");
	}

	public void actualizar2()
	{
		System.out.println("Mi nombre es " + super.getNombre() + ".");
		System.out.println("Mi edad es de " + super.getEdad() + " años.");
		System.out.println("Mi cargo es " + super.getCargo() + ".");
		System.out.println("Mi salario mensual es de " + super.getSalario() + " pesos.");
		System.out.println("La garantia de los productos son de " + this.tiempoDeGarantiaProducto + " años.");
		System.out.println("El enfoque es netamente " + this.enfoque + ".");
	}
}