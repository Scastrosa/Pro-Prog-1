package modelo;

public class Mundo 
{
	private Heroes her1;
	private Heroes her2;
	private Mortales mor1;
	private Desterrados des1;
	private Mortales mor2;
	
	public Mundo()
	{
		her1 = new Heroes("azul", 29, 3, true, "Kira");
		her2 = new Heroes("azul", 30, 3, true, "Astar");
		mor1 = new Mortales("violeta", 17, 1.65, true, "Sergio");
		mor2 = new Mortales("violeta", 17, 1.72, true, "Juan");
		des1 = new Desterrados("rojo", 1500, 2, false, "Renk");
	}

	public Heroes getHer1() 
	{
		return her1;
	}

	public void setHer1(Heroes her1) 
	{
		this.her1 = her1;
	}

	public Heroes getHer2() 
	{
		return her2;
	}

	public void setHer2(Heroes her2) 
	{
		this.her2 = her2;
	}

	public Mortales getMor1() 
	{
		return mor1;
	}

	public void setMor1(Mortales mor1) 
	{
		this.mor1 = mor1;
	}
	
	public Mortales getMor2() 
	{
		return mor2;
	}

	public void setMor2(Mortales mor2) 
	{
		this.mor2 = mor2;
	}

	public Desterrados getDes1() 
	{
		return des1;
	}

	public void setDes1(Desterrados des1) 
	{
		this.des1 = des1;
	}
}
