package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public int ingresarArgumento()
	{
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el argumento 1: "));
	}
	
	public double ingresarArgumento2()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el argumento 2: "));
	}
	
	public void mostrarDatos(String hacerSobrecarga) 
	{
		JOptionPane.showMessageDialog(null, hacerSobrecarga + ".");
	}
	
	public void mostrarDatos1(String hacerSobrecarga1)
	{
		JOptionPane.showMessageDialog(null, hacerSobrecarga1 + ".");
	}
	
	public void mostrarDatos2(String hacerSobrecarga2)
	{
		JOptionPane.showMessageDialog(null, hacerSobrecarga2 + ".");
	}
}