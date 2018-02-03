import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		
		// Message initial
		System.out.println("JEU DE HASARD"
				      +  "\n-------------");
		
		// Boucle sur une partie complète
		char jouer ;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			
			// Définition des variables
			int x = (int) (Math.random() * 100 + 1) ;
			int choix = -1 ;
			int score = 0 ;
			
			// Procédure
			while(choix != x)
			{
				choix = -1 ;
				while(choix<1 || choix>100)
				{
					System.out.println("Choisissez un nombre entre 1 et 100 :");
					choix = sc.nextInt();
				}
				if(choix>x)
					System.out.println("x est plus petit que "+choix+" !");
				if(choix<x)
					System.out.println("x est plus grand que "+choix+" !");
				score++;
			}
			
			// Message final
			System.out.println("Gagné !");
			System.out.println("Vous avez trouvé x en "+score+" tentatives.");
			
			jouer = ' ' ;
			while(jouer != 'o' && jouer != 'n')
			{
				System.out.println("Rejouer ? [o/n]");
				sc.nextLine();
				jouer = sc.nextLine().charAt(0);
			}
			
		} while(jouer == 'o');
		
		System.out.println("Au revoir !");

	}

}
