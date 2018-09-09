package controlador;

import modelo.Comercial;
import modelo.Ejecutivo;
import modelo.Mantenimiento;
import modelo.Tecnologia;

public class Principal 
{
	private static Mantenimiento man1;
	private static Tecnologia tec1;
	private static Ejecutivo eje1;
	private static Comercial com1;
	
	public static void main(String[] args) 
	{
		man1 = new Mantenimiento("Sergio Castro", 18, 1245789, "Encargado en reparaciones", 29, 248);
		man1.actualizar1();
		man1.caminar();
		man1.trabajar();
		man1.restaurar();
		System.out.println("");
		tec1 = new Tecnologia("Juan Salazar", 25, 1000000, "Tecnico en planeacion y ejecucion", 4, "productivo");
		tec1.actualizar2();
		tec1.caminar();
		tec1.trabajar();
		tec1.produccion();
		System.out.println("");
		eje1 = new Ejecutivo("Andres Cadavid", 22, 3000000, "Gerente ejecutivo", 2, 5, "administrativa", 8);
		eje1.actualizar3();
		eje1.caminar();
		eje1.trabajar();
		eje1.coordinar();
		eje1.hechar();
		System.out.println("");
		com1 = new Comercial("Felipe Suarez", 29, 2800000, "Gerente comercial", 4, 6, "cobranza", 6);
		com1.actualizar4();
		com1.caminar();
		com1.trabajar();
		com1.dirigir();
		com1.hechar();
	}
}