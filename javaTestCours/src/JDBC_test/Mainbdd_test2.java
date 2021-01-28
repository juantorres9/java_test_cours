package JDBC_test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import collectionEnum.AfficheConsole;

public class Mainbdd_test2 {

	public static void main(String[] args) {
		//UI
		Scanner scanner = new Scanner( System.in );
		
		Connection c1 = ConnectionSingleton.getConnection();
		String sql = "CREATE TABLE IF NOT EXISTS tb_task2 (\r\n"
				+ "              _id INTEGER PRIMARY KEY ,\r\n"
				+ "	title TEXT NOT NULL,\r\n"
				+ "	priority INTEGER NOT NULL,\r\n"
				+ "	description TEXT\r\n"
				+ ")";
		String sql2 = "SELECT * FROM tb_task2 WHERE _id=1";
		
		Statement stmt = null;
		ResultSet rs2=null;
		AfficheConsole af=new AfficheConsole();
		ResultSetMetaData rsmetadata;
			try {
				stmt =c1.createStatement();
				stmt.execute(sql);
				
	
				stmt.close();
			} catch (SQLException e) {	e.printStackTrace();}finally {af.af1("fin du statement");	}
			try {		
				rs2=stmt.executeQuery(sql2);
				rsmetadata=rs2.getMetaData();
				System.out.println("Description de la BDD");
				int count=rsmetadata.getColumnCount();
				for (int i=1;i<=count;i++) {
				    String name=rsmetadata.getColumnName(i);
				    System.out.println("le nom du column"+i+"est="+name);}
				} catch (SQLException e) {	e.printStackTrace();}finally {af.af1("fin du statement");	}
			
	af.af1("voulez vous effacer la bdd? OUI NON");
	 String a = scanner.next();
	 if (a.equals("OUI")) {
		 deleteTable("tb_task2",c1);
	 }else {
		 af.af1("la BDD ne sras pas effacé");}
	 af.af1("choix user is="+a);
	 
	}
	
//command deux
	
	
	public static void deleteTable(String table_name,Connection c) {
		String sql3 = String.format("DROP TABLE IF EXISTS %s",table_name);
		System.out.println("la requete est :"+sql3);
		Statement stmt=null;
		try {
			stmt =c.createStatement();
			stmt.execute(sql3);
			
	        //pstmt1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}

