package modelo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EscYLee 
{
	private Properties prop = new Properties();
	private String archivoprop = "F:\\SEGUNDO SEMESTRE\\Programación I\\Propiedades\\data\\archivo.properties";

	public void escribirPropiedades() 
	{
		try {
			prop.setProperty("Nombre", "Sergio");
			prop.setProperty("Alias", "ChechoMaster");
			prop.setProperty("Puntaje", "100.Java");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}

	public void leerPropiedades() 
	{
		try 
		{
			// load a properties file for reading
			prop.load(new FileInputStream(archivoprop));
			// get the properties and print
			prop.list(System.out);
			//Reading each property value
			System.out.println(prop.getProperty("Nombre"));
			System.out.println(prop.getProperty("Alias"));
			System.out.println(prop.getProperty("Puntaje"));
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}