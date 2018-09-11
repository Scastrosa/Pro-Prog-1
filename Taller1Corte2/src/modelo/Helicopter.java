package modelo;

public class Helicopter extends Airplane
{
	private int numHelices;
	
	public Helicopter()
	{
		super.tipoVehicle = "Aeronautico";
		super.tipoMotores = "Motor de turbina de gas";
		this.numHelices = 6;
	}
	
	public String anguloAtaque()
	{
		return "el de un aeroplano";
	}
	
	public String takeOff() 
	{
		return "verticalmente";
	}

	public String lend() 
	{
		return "verticalmente";
	}

	public String fly() 
	{
		return "facilidad que un avión";
	}

	public String funcionamiento() 
	{
		return "complejo que el de un avión";
	}

	public String capacidad() 
	{
		return "1 a 4 personas";
	}
}