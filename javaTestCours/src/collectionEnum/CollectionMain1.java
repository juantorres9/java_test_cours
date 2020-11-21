package collectionEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionMain1 {

	public static void main(String[] args) {
		AfficheConsole af=new AfficheConsole();
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		String []array1= new String [3];
		
		for (int i=0;i < array1.length;i++) {
			array1[i]= "Pomme="+(3+i);
		    af.af1("la valeur vaut d'array vaut="+array1[i]);	
		}
		
		
		//addition des valeurs ponctuelles dans ARRAYLIST
		l1.add("orange-1");
		l1.add("pasteque-2");
		//addition des objets non String
		l1.add(40.55);
		l1.add(47);
		l1.add(((byte) 127));
		//creation d'un ArrayList à partir d'un Array
		l2=Arrays.asList(array1);
		 
		//addition de tous valeurs d'une list dans une autre list
		l1.addAll(l2);
		
		//iteration d'une collection
		Iterator i = l1.iterator();
		while(i.hasNext()) {
		af.af1("la valeur du composed Arraylist vaut="+i.next());
		}
		}
		

	}


