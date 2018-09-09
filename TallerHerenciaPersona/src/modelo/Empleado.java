package modelo;

public class Empleado extends Persona
{
	protected double salario;
	protected String cargo;
	
	public Empleado(String pNombre, int pEdad, double pSalario, String pCargo) 
	{
		super(pNombre, pEdad);
		this.salario = pSalario;
		this.cargo = pCargo;
	}

	public double getSalario() 
	{
		return salario;
	}
	
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	public String getCargo() 
	{
		return cargo;
	}
	
	public void setCargo(String cargo) 
	{
		this.cargo = cargo;
	}
	
	public void trabajar()
	{
		System.out.println("Yo realizo mis labores con compromiso.");
	}
}