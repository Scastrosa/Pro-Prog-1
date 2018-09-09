package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public double ingresarLado()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado del cuadrado"));
	}
	
	public void imprimirCuadrado(double area, double perimetro)
	{
		JOptionPane.showMessageDialog(null, "El area del cuadrado es " + area + " .");
		JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es " + perimetro + ".");
	}
	
	public double ingresarRadio()
	{
		return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio del circulo"));
	}
	
	public void imprimirCirculo( double area1, double perimetro1)
	{
		JOptionPane.showMessageDialog(null, "El area del circulo es " + area1 + " .");
		JOptionPane.showMessageDialog(null, "El perimetro del circulo es " + perimetro1 + ".");
	}
}