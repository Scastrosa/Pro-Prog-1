package controlador;

import modelo.Mundo;

public class Principal 
{
	private static Mundo m;
	
	public static void main(String[] args) 
	{
		m = new Mundo();
		m.getHer1().actual1();
		m.getHer1().crearFuego();
		m.getHer1().detenerTiempo();
		m.getHer1().volar();
		m.getHer1().habitarPlaneta();
		m.getHer1().sentir();
		System.out.println("");
		m.getHer2().actual1();
		m.getHer2().crearFuego();
		m.getHer2().detenerTiempo();
		m.getHer2().volar();
		m.getHer2().habitarPlaneta();
		m.getHer2().sentir();
		System.out.println("");
		m.getDes1().actual2();
		m.getDes1().arrastrar();
		m.getDes1().habitarPlaneta();
		m.getDes1().sentir();
		System.out.println("");
		m.getMor1().actual3();
		m.getMor1().adquirirConocimiento();
		m.getMor1().ejercerProfesion();
		m.getMor1().tenerFamilia();
		m.getMor1().habitarPlaneta();
		m.getMor1().sentir();
		System.out.println("");
		m.getMor2().actual3();
		m.getMor2().adquirirConocimiento();
		m.getMor2().ejercerProfesion();
		m.getMor2().tenerFamilia();
		m.getMor2().habitarPlaneta();
		m.getMor2().sentir();
	}
}
