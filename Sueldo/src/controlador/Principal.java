package controlador;

import java.util.Scanner;

import modelo.Sueldo;

public class Principal 
{
	public static void main(String[] args) 
	{
		Sueldo salario = new Sueldo();
		Scanner l = new Scanner(System.in);
		boolean seguir = true;

		while(seguir == true)
		{
			System.out.println("Intoduzca un sueldo por favor");	
			String respu = l.nextLine();	

			try{
				int sueldo = Integer.parseInt(respu);
				if (sueldo ==-1)
				{
					System.out.println("El sueldo menor es: "+ salario.mayorNum());
					System.out.println("El sueldo mayor es: "+ salario.menorNum());
					System.out.println("El sueldo promedio es: "+ salario.promedioSueldo());
					seguir = false;
					l.close();
				}
				else if(salario.agregarSueldo(sueldo)==true)
				{
					System.out.println("Sueldo agregado correctamente");

				}
				else if(salario.agregarSueldo(sueldo)!=true)
				{
					System.out.println("Ya se agregaron los 20 sueldos");
					System.out.println("El sueldo mayor es "+ salario.mayorNum());
					System.out.println("El sueldo menor es "+ salario.menorNum());
					System.out.println("El sueldo promedio es "+ salario.promedioSueldo());
					seguir = false;
					l.close();
				}
			}
			
			catch (Exception e) {
				System.out.println("Error al introducir el numero");
			}
		}
	}
}
