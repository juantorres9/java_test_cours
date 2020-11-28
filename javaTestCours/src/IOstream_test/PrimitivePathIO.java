package IOstream_test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import collectionEnum.AfficheConsole;

public class PrimitivePathIO {

	public static void main(String[] args) {
		
		String cheminFolder1="C:\\Users\\jctorreszetino\\Desktop\\DEST";
      	Path p1=Paths.get(cheminFolder1);
      	
      	AfficheConsole af=new AfficheConsole();
      	//methodes to examine path
      	af.af1("the name of the file is of this path is ="+p1.getFileName());
      	af.af1("le nombre d'élements composant le path est="+p1.getNameCount());
      	
        for (int i=0;i<p1.getNameCount();i++) {
        	Path element=p1.getName(i);
        	af.af1("l'element "+i+" vaut ="+element);
        }
		// conversion d'une path a une string
        String string_p1=p1.toString();
        af.af1("original path is = \n"+p1);
        af.af1("string converted path is  = \n"+string_p1);
        af.af1("brut string is  = \n"+cheminFolder1);
        
        
        
        af.af1("string converted path is  = \n"+string_p1);
	
        //Verification de l'existance d'une chemin 
        if (Files.exists(p1)) {
        	af.af1("le repertoire parent exist"+p1);
        }else {
        	af.af1("le repertoire parent n'exist pas sur "+p1);
        }
        
  
        		
	    //File f1 = new File(cheminFolder1+"\\TOTO");
	   /** if(!f1.exists() && Files.exists(p1)) {
	    	af.af1("repertoire n'existe pas encore , le creer sur="+cheminFolder1);
	    	f1.mkdir();
	    }else {
	    	af.af1("repertoire dèja existant");
	    }**/
	}

}
