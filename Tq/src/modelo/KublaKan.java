package modelo;

public abstract class KublaKan 
{
	protected String colorOjos;
	protected int edad;
	protected double estatura;
	protected boolean alma;
	
	public KublaKan(String pColorOjos, int pEdad, double pEstatura, boolean pAlma)
	{
		this.colorOjos = pColorOjos;
		this.edad = pEdad;
		this.estatura = pEstatura;
		this.alma = pAlma;
	}
	
	public String getColorOjos() 
	{
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) 
	{
		this.colorOjos = colorOjos;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public double getEstatura() 
	{
		return estatura;
	}

	public void setEstatura(double estatura) 
	{
		this.estatura = estatura;
	}

	public boolean getAlma() 
	{
		return alma;
	}

	public void setAlma(boolean alma) 
	{
		this.alma = alma;
	}

	public abstract void habitarPlaneta();
	public abstract void sentir();
}