package modelo;

import javax.swing.JOptionPane;

import controlador.Controlador;

public class Credito 
{
	private double periodo;
	private double interes;
	private double inversion;
	private double tasaEfec;
	private double valorAnual;
	private double valorCuota;
	
	public Credito(double pPeriodo, double pInteres, double pInversion)
	{
		periodo = pPeriodo;
		interes = pInteres/100;
		inversion = pInversion;
		tasaEfec = calcularTasaEfectiva();
		valorAnual = calcularAnualidad();
		valorCuota = calcularCuota();
	}
	
	public double calcularTasaEfectiva()
	{
		return tasaEfec = (Math.pow(1 + interes, 1/12.0)-1); 
	}
	
	public double calcularAnualidad()
	{
		return valorAnual = (1- Math.pow((1 + tasaEfec), - periodo))/tasaEfec;
	}
	
	public double calcularCuota()
	{
		return valorCuota = inversion / valorAnual;
	}
	
	public double getPeriodo() 
	{
		return periodo;
	}

	public void setPeriodo(int periodo) 
	{
		this.periodo = periodo;
	}

	public double getInteres() 
	{
		return interes;
	}

	public void setInteres(double interes) 
	{
		this.interes = interes;
	}

	public double getInversion() 
	{
		return inversion;
	}

	public void setInversion(double inversion) 
	{
		this.inversion = inversion;
	}

	public double getTasaEfec() 
	{
		return tasaEfec;
	}
	
	public void setTasaEfec(double tasaEfec) 
	{
		this.tasaEfec = tasaEfec;
	}

	public double getValorAnual() 
	{
		return valorAnual;
	}

	public void setValorAnual(double valorAnual) 
	{
		this.valorAnual = valorAnual;
	}

	public double getValorCuota() 
	{
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) 
	{
		this.valorCuota = valorCuota;
	}

}