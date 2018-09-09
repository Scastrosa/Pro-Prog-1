package modelo;

import java.io.*;

public class Mundo 
{
	private String rutaArchivo="F:\\SEGUNDO SEMESTRE\\Programación I\\ExcepcionesV2\\data/numeros.txt";
	
	public Mundo()
	{
		
	}
	
	public void escribirArchvio() 
	{
		File f=new File("F:\\SEGUNDO SEMESTRE\\Programación I\\ExcepcionesV2\\data/numeros.txt");
		try {
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			for (int i = 1; i < 20; i++) 
			{
				pw.println(i);
			}
			fw.close();
		}
		catch(IOException e) 
		{
			System.out.println("Error.");
		}
	}

	public void leerArchvio() 
	{
		try
		{
			FileReader fr=new FileReader(rutaArchivo);
			BufferedReader br= new BufferedReader(fr);
			String linea=br.readLine();
			while(linea!=null)
			{
				System.out.println(linea);
				linea=br.readLine();
			}
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("Averigue mas acerca del error.");
		}
	}
}