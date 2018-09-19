package modelo;

public class Mundo 
{
	private Alumno a;
	private Persona p;
	private Profesor p1;
	private Persona personas[];

	public Mundo()
	{
		a = new Alumno();
		p = new Persona();
		p1 = new Profesor();
		personas = new Persona[3];
		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
	}
	
	public String crear()
	{
		String linea = "";
		for (int i = 0; i < personas.length; i++) 
		{
			linea = linea + personas[i].toString() + "/ln";
		}
		return linea;
	}
}