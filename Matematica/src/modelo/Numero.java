package modelo;

public class Numero extends Operar
{	
	public Numero(int pSuma) 
	{
		super(pSuma);
		suma();
	}

	public String suma() 
	{
		{
			int x, total;
			int dv = 0;
			x =super.suma;
			total = 0;
			while(x > 0)
			{
				total += x % 10;
				x /= 10;
			}
			
			while (total > 9)
			{
				x = total;
				total = 0;
				while(x > 0)
				{
					total += x % 10;
					x /= 10;
				}
			}
			dv = total;
			return "El resultado es: "+dv;
		}
	}
}