package IOstream_test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import collectionEnum.AfficheConsole;

public class PrimitiveStreamIo1 {

	public static void main(String[] args) {
		
		String cheminFolder1="C:\\Users\\jctorreszetino\\DEST";
      	Path p1=Paths.get(cheminFolder1);
      	AfficheConsole af=new AfficheConsole();
        
      	File folder1=new File(cheminFolder1+"\\TOTO");
        File file1=new File(folder1.getAbsolutePath()+"\\file1.txt");
        
        //Verification de l'existance d'une chemin 
        if (Files.exists(p1)) {
        	af.af1("le repertoire paren existe sur="+p1);
        	folder1.mkdir();
        	if (!file1.exists()) {
        		af.af1("le fichier n'existe pas sur="+file1.getAbsolutePath());
        		try {
        			file1.createNewFile();
        			}catch(IOException e) {af.af1("error"+e);};
        	}else{
        			af.af1("le fichier existe dèja sur"+file1.getAbsolutePath());
        	}
        }else{
        	af.af1("le repertoire parent n'exist pas sur "+p1);
        	}

        		
	 
	}

}
