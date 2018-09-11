package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo m;
	private Interfaz i;
	
	public Controlador()
	{
		i = new Interfaz();
		m = new Mundo();
		m.getS().eat(); 
		m.getS().fly(); 
		m.getS().leapBuilding(); 
		m.getS().lend(); 
		m.getS().salvar(); 
		m.getS().stopBullet();
		i.imprimirSuperman("verde", m.getS().salvar(), m.getS().takeOff(), m.getS().lend(), m.getS().fly(), m.getS().leapBuilding(), m.getS().stopBullet(), m.getS().eat());
		
		m.getB().eat(); 
		m.getB().buildNeat(); 
		m.getB().fly(); 
		m.getB().layEggs(); 
		m.getB().lend(); 
		m.getB().takeOff();
		i.ImprimirBird(m.getB().buildNeat(), m.getB().eat(), m.getB().fly(), m.getB().layEggs(), m.getB().lend(), m.getB().takeOff());
		
		m.getH().anguloAtaque();
		m.getH().capacidad();
		m.getH().funcionamiento();
		m.getH().fly();
		m.getH().lend(); 
		m.getH().takeOff();
		i.imprimirHelicopter(m.getH().anguloAtaque(), m.getH().takeOff(), m.getH().fly(), m.getH().lend(), m.getH().capacidad(), m.getH().funcionamiento());
		
		m.getSp().mision();
		m.getSp().capacidad();
		m.getSp().funcionamiento();
		m.getSp().fly();
		m.getSp().lend(); 
		m.getSp().takeOff();
		i.imprimirSeaplane(m.getSp().mision(), m.getSp().takeOff(), m.getSp().fly(), m.getSp().lend(), m.getSp().capacidad(), m.getSp().funcionamiento());
	}
}
