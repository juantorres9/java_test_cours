package collectionEnum;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		Countrie c=Countrie.ALLEMAGNE;
		Countrie c2=null;
		Scanner input1= new Scanner(System.in);
		String c3=input1.next();
		c2=Countrie.valueOf(c3);
		
		System.out.println("la valeur de l'enumeration vaut"+c);
		
		
		switch (c2) {
		case USA:
			System.out.println("la valeur de l'enumeration vaut USA");
			break;
		case SALVADOR:
			System.out.println("la valeur de l'enumeration vaut Salvador");
			break;
		default:
			System.out.println("la valeur de l'enumeration vaut AUTRE");
			break;
		}

	}

}
