package modelo;

public class Mundo 
{
	private Superman s;
	private Bird b;
	private Helicopter h;
	private Seaplane sp;
	
	public Mundo()
	{
		s = new Superman();
		b = new Bird();
		h = new Helicopter();
		sp = new Seaplane();
	}

	public Superman getS() 
	{
		return s;
	}

	public void setS(Superman s) 
	{
		this.s = s;
	}

	public Bird getB() 
	{
		return b;
	}

	public void setB(Bird b) 
	{
		this.b = b;
	}

	public Helicopter getH() 
	{
		return h;
	}

	public void setH(Helicopter h) 
	{
		this.h = h;
	}

	public Seaplane getSp() 
	{
		return sp;
	}

	public void setSp(Seaplane sp) 
	{
		this.sp = sp;
	}
}