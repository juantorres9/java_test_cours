package JDBC_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
//paramètres de connection
	private static  String url="jdbc:sqlite:C://sqlite/db/TASK_APP_DB";  //Url du serveur à se connecter + la base de données
	//private static String user="root"; SQLITE NOT SUPPORTED BY DEFAULT
	//private  static String motpasse="root";	 SQLITE NOT SUPPORTED BY DEFAULT
	
	//connection static instance
	private static Connection connection1;
	
	static{
		try {
			Class.forName("org.sqlite.JDBC");//charger Driver JDBC Jar
			connection1=DriverManager.getConnection(url);//se connecter avec URL base de donnes 
			System.out.println("connection d el BDD est ok ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//ACCESESSEUR
	public static Connection getConnection() {
		return connection1;
	}
	
	
}
