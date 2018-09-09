package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public double ingresarPeriodo()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Introduzca un periodo"));
	}

	public double ingresarInteres()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Introduzca un interes"));
	}

	public double ingresarInversion()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Introduzca su inversion"));
	}

	public void imprimirDatos(double tasaEfec, double valorAnual, double valorCuota)
	{
		JOptionPane.showMessageDialog(null,"Su tasa efectiva es de " + tasaEfec + " %.");
		JOptionPane.showMessageDialog(null,"Su valor anual es de " + valorAnual + " pesos.");
		JOptionPane.showMessageDialog(null,"Su valor de la cuota es de " + valorCuota + " pesos.");
	}
}