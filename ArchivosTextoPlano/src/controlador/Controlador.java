package controlador;

import modelo.Mundo;

public class Controlador {
private static Mundo m ;
	public Controlador(){
	
	m=new Mundo();
	m.escribirArchvio();
	m.leerArchvio();
}
}
