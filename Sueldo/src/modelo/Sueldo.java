package modelo;

import java.util.ArrayList;

public class Sueldo 
{
	private ArrayList<Integer> salario;

	public Sueldo()
	{
		salario = new ArrayList<>();
	}

	public boolean agregarSueldo(int pSueldo)
	{
		boolean r = false;

		if(salario.size() < 20)
		{
			salario.add(pSueldo);
			r = true;
		}
		return r;		
	}

	public int menorNum()
	{ 
		int menor =salario.get(0);
		for (int i = 0; i < salario.size(); i++)
		{
			if(salario.get(i)<menor)
			{
				menor = salario.get(i);
			}
		}
		return menor;
	}

	public int mayorNum()
	{
		int mayor = 0;
		for (int i = 0; i < salario.size(); i++)
		{
			if(salario.get(i)>mayor)
			{
				mayor = salario.get(i);
			}
		}
		return mayor;
	}

	public int promedioSueldo()
	{
		int promedio = 0;
		{
			for (int i = 0; i < salario.size(); i++)
			{
				promedio = promedio + salario.get(i);
			}
		}
		return promedio/salario.size();
	}
}