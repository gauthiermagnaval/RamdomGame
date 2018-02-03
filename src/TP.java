import java.util.Scanner;

public class TP {

	public static void main(String[] args) {
		
		// Message initial
		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT"+
						 "\n-------------------------------------------------");
		
		// Définition des variables
		Scanner sc = new Scanner(System.in) ;
		String reponse = new String("o");
		
		while(reponse.equals("o"))
		{
			// Définition des variables
			String mode = new String();
			double celsius ;
			double fahrenheit ;
			
			// Choix du mode de conversion
			while(!mode.equals("1") && !mode.equals("2"))
			{
				System.out.println("Choisissez le mode de conversion :"+ 
						"\n1 - Convertisseur Celsius - Fahrenheit" + 
						"\n2 - Convertisseur Fahrenheit - Celsius");
				mode = sc.nextLine();
			}
			int i = Integer.valueOf(mode).intValue() ;
			
			// Convertisseur Celsius - Fahrenheit
			if (i==1)
			{
				System.out.println("Température à convertir :");
				String str = sc.nextLine();
				celsius = Double.valueOf(str).doubleValue();
				fahrenheit = 9.0/5.0*celsius + 32.0 ;
				System.out.println(celsius+" °C correspond à "+fahrenheit+" °F.");
			}
			
			// Convertisseur Fahrenheit - Celsius
			else
			{
				System.out.println("Température à convertir :");
				String str = sc.nextLine();
				fahrenheit = Double.valueOf(str).doubleValue();
				celsius = (fahrenheit - 32.0) * 5.0 / 9.0 ;
				System.out.println(fahrenheit+" °F correspond à "+celsius+" °C.");
			}
			
			// Possibilité de convertir une autre température
			reponse = "" ;
			while(!reponse.equals("o") && !reponse.equals("n"))
			{
				System.out.println("Souhaitez-vous convertir une autre température ? [o/n]");
				reponse = sc.nextLine();
			}
						
		}
		
		// Message de fin
		System.out.println("Au revoir !");

	}
	
}
