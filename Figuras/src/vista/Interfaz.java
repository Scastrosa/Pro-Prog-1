package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public String ingresarLado()
	{
		return JOptionPane.showInputDialog("Ingrese el valor del lado del cuadrado");
	}
	
	public void imprimirCuadrado(String string, double area, double perimetro)
	{
		JOptionPane.showMessageDialog(null, "El area del cuadrado es " + area + " .");
		JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es " + perimetro + ".");
	}
	
	public String ingresarRadio()
	{
		return JOptionPane.showInputDialog("Ingrese el valor del radio del circulo");
	}
	
	public void imprimirCirculo( double area1, double perimetro1)
	{
		JOptionPane.showMessageDialog(null, "El area del circulo es " + area1 + " .");
		JOptionPane.showMessageDialog(null, "El perimetro del circulo es " + perimetro1 + ".");
	}
	
	public String ingresarLado2()
	{
		return JOptionPane.showInputDialog("Ingrese el valor del lado del rombo");
	}
	
	public String ingresarLado3()
	{
		return JOptionPane.showInputDialog("Ingrese el valor del lado del rombo");
	}
	
	public void imprimirRombo(double area2, double perimetro2)
	{
		JOptionPane.showMessageDialog(null, "El area del rombo es " + area2 + ".");
		JOptionPane.showMessageDialog(null, "El perimetro del rombo es " + perimetro2 + ".");
	}
}