package modelo;

import java.util.Scanner;

public class Mundo 
{
	private Numero n;

	public Mundo()
	{
		operar();
	}
	
	public void operar()
	{
		int y = 0;
		do{
			Scanner n2 = new Scanner(System.in);
			System.out.println("Ingrese el numero que quiere operar");
			String m = n2.nextLine();
			try {
				int numero = Integer.parseInt(m);
				n = new Numero(numero);
				System.out.println(n.suma());

			} catch (Exception e) {
				System.out.println("El digito no es valido.");
			}
		}while(y != 1);
	}
}
