package collectionEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain2 {

	public static void main(String[] args) {
		AfficheConsole af=new AfficheConsole();
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		
		String []array1= new String [3];
		
		for (int i=0;i < array1.length;i++) {
			array1[i]= "Pomme="+(3+i);
		    af.af1("la valeur vaut d'array vaut="+array1[i]);	
		}
	
		//addition des valeurs ponctuelles dans ARRAYLIST
		l1.add("orange-1");
		l1.add("pasteque-2");
		//addition des objets non String
		l1.add(40.55f);
		l1.add(47);
		l1.add(((byte) 127));
		//creation d'un ArrayList à partir d'un Array
		l2=Arrays.asList(array1);
		 
		//addition de tous valeurs d'une list dans une autre list
		l1.addAll(l2);
		af.af1("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		//iteration d'une collection
		Iterator i = l1.iterator();
		while(i.hasNext()) {
		af.af1("la valeur du composed Arraylist vaut="+i.next());
		}
		af.af1("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//classic iteration
		for (int j=0;j< l1.size();j++) {
			af.af1("For loop on list size="+l1.size()+"est égal à="+l1.get(j));
			
		}
		//classic iteration
		for (int j=0;j<= l1.size();j++) {
			try {
			af.af1("For loop on list size="+l1.size()+"est égal à="+l1.get(j));
			} catch (Exception e) {
				af.af1("exception found ="+e);
			}
		}
		
		}
		

	}


