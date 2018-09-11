package modelo;

public class Seaplane extends Airplane
{
	private String contexto;
	
	public Seaplane()
	{
		super.tipoVehicle = "Aeronautico";
		super.tipoMotores = "Motor de piston";
		this.contexto = "Se usan donde hay muchos lagos";
	}
	
	public String mision()
	{
		return "distintas misiones";
	}
	
	public String takeOff() 
	{
		return "en el agua como en el pavimento";
	}

	public String lend() 
	{
		return "agua como en paimento por medio de una pista";
	}

	public String fly() 
	{
		return "los alerones y propulsores que posee";
	}

	public String funcionamiento() 
	{
		return "un airplane debido a los flotadores que posee";
	}

	public String capacidad() 
	{
		return "1 a 40 pasajeros";
	}
}