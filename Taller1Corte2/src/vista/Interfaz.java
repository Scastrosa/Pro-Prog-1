package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public void imprimirSuperman(String colorOjos, String salvar, String takeOff, String lend, String fly, String leapBuilding,String stopBullet, String eat)
	{
		JOptionPane.showMessageDialog(null, "Hola, soy Superman, mi color de ojos es " + colorOjos + " y las acciones que puedo hacer son: ");
		JOptionPane.showMessageDialog(null, "Yo salvo vidas con el fin de " + salvar + ".");
		JOptionPane.showMessageDialog(null, "Puedo aterrizar con ayuda de " + takeOff + ".");
		JOptionPane.showMessageDialog(null, "Puedo despegar con ayuda de " + lend + ".");
		JOptionPane.showMessageDialog(null, "Puedo volar con ayuda de " + fly + ".");
		JOptionPane.showMessageDialog(null, "Salto edificios con ayuda de " + leapBuilding + ".");
		JOptionPane.showMessageDialog(null, "Detengo las balas con mi poder de " + stopBullet + ".");
		JOptionPane.showMessageDialog(null, "Tengo que alimentarme bien para " + eat + ".");
	}
	
	public void ImprimirBird(String takeOff, String lend, String fly, String buildNeat, String layEggs, String eat)
	{
		JOptionPane.showMessageDialog(null, "Hola, soy Bird y las acciones que realizo son: ");
		JOptionPane.showMessageDialog(null, "Yo aterrizo en " + takeOff + ".");
		JOptionPane.showMessageDialog(null, "Yo despego de " + lend + ".");
		JOptionPane.showMessageDialog(null, "Yo vuelo por medio de " + fly + ".");
		JOptionPane.showMessageDialog(null, "Yo construyo mi nido " + buildNeat + ".");
		JOptionPane.showMessageDialog(null, "Yo pongo mis huevos con " + layEggs + ".");
		JOptionPane.showMessageDialog(null, "Yo me alimento de lombrices que encuentro en " + eat + ".");
	}
	
	public void imprimirHelicopter(String anguloAtaque, String takeOff, String fly, String lend, String capacidad, String funcionamiento)
	{
		JOptionPane.showMessageDialog(null, "El Helicopter tiene: ");
		JOptionPane.showMessageDialog(null, "El angulo de ataque es mas amplio que " + anguloAtaque + ".");
		JOptionPane.showMessageDialog(null, "Puede aterrizar " + takeOff + ".");
		JOptionPane.showMessageDialog(null, "Puede volar con mas " + fly + ".");
		JOptionPane.showMessageDialog(null, "Puede despegar " + lend + ".");
		JOptionPane.showMessageDialog(null, "Su capacidad oscila entre " + capacidad + ".");
		JOptionPane.showMessageDialog(null, "Su funcionamiento es mas " + funcionamiento + ".");
	}
	
	public void imprimirSeaplane(String mision, String takeOff, String fly, String lend, String capacidad, String funcionamiento)
	{
		JOptionPane.showMessageDialog(null, "El Seaplane tiene: ");
		JOptionPane.showMessageDialog(null, "Se usa para " + mision + ".");
		JOptionPane.showMessageDialog(null, "Su aterrizaje puede ser tanto " + takeOff + ".");
		JOptionPane.showMessageDialog(null, "El Seaplane vuela por medio de " + fly + ".");
		JOptionPane.showMessageDialog(null, "Su despegue puede ser tanto en " + lend + ".");
		JOptionPane.showMessageDialog(null, "Su capacidad va desde " + capacidad + ".");
		JOptionPane.showMessageDialog(null, "Su funcionamiento es mas complejo que el de " + funcionamiento + ".");
	}
}
