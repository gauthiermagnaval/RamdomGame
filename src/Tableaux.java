import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		
		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		Scanner sc = new Scanner(System.in);
		char reponse = 'o';
		char carac = ' ';
		
		while(reponse == 'o')
		{
			reponse = ' ';
			int i = 0;
			System.out.println("Saisissez une lettre minuscule :");
			carac = sc.nextLine().charAt(0);
			while(i<tableauCaractere.length && carac != tableauCaractere[i])
				i++;
			if(i<tableauCaractere.length)
				System.out.println(carac+" est dans le tableau à la position "+(i+1));
			else
				System.out.println(carac+ " n'est pas dans le tableau");
			while(reponse!='o' && reponse!='n')
			{
				System.out.println("Voulez-vous continuer ? [o/n]");
				reponse = sc.nextLine().charAt(0);
			}

		}
		
		System.out.println("Au revoir !");
		
		
		
	}

}
