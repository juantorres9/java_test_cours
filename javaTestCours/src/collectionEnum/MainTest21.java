package collectionEnum;

import java.util.Scanner;

public class MainTest21 {
public static void affiche(Object o) {
	System.out.println("l'objet vaut="+o);
}
	
	public static void main(String[] args) {
		//declaration des variables FRUIT
		Fruit f1=Fruit.ORANGE,f2=Fruit.FRAISE,f3=Fruit.BANANE;
		
	//Utilisation des methodes par default de l'enumeration: values();
	Fruit [] fruits=Fruit.values();
	for (int i=0; i< fruits.length; i++) {
		affiche(fruits[i]);
	}
	//Utilisation des valeurs specifique d'une enumeration
	affiche("extra"+Fruit.valueOf("BANANE"));
	affiche("oooooooooooooooooooooooooooooooo");
	affiche("extra"+f3.getVitamine());
	affiche("oooooooooooooooooooooooooooooooo");
	f3.getVitamine();
	
	}

}
