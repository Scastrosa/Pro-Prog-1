package modelo;
public class Gerente extends Empleado
{
	protected int personasCargo;
	protected int citas;
	
	public Gerente(String pNombre, int pEdad, double pSalario, String pCargo, int pPersonasCargo, int pCitas) 
	{
		super(pNombre, pEdad, pSalario, pCargo);
		this.personasCargo = pPersonasCargo;
		this.citas = pCitas;
	}
	
	public int getPersonasCargo() 
	{
		return personasCargo;
	}

	public void setPersonasCargo(int personasCargo) 
	{
		this.personasCargo = personasCargo;
	}
	
	public int getCitas() 
	{
		return citas;
	}

	public void setCitas(int citas) 
	{
		this.citas = citas;
	}
	
	public void hechar()
	{
		System.out.println("Y despido a mis empleados cuando no trabajan.");
	}
}