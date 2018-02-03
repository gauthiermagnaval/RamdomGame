
public class Test {

	public static void main(String[] args) {
		
		String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
				
		for(String str1[] : tab)
		{
			for(String str2 : str1)
				System.out.println(str2) ;
		}

	}

}
