package JDBC_test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Mainbdd_test1 {

	public static void main(String[] args) {
		Connection c1 = ConnectionSingleton.getConnection();
		String sql = "SELECT * FROM tb_task";
		Statement stmt;
		ResultSet rs;		
		ResultSetMetaData rsmetadata;
			try {
				stmt =c1.createStatement();
				rs=stmt.executeQuery(sql);
				rsmetadata=rs.getMetaData();
				
				System.out.println("Description de la BDD");
				int count=rsmetadata.getColumnCount();
				for (int i=1;i<=count;i++) {
				    String name=rsmetadata.getColumnName(i);
				    System.out.println("le nom du column"+i+"est="+name);
				}
				
				System.out.println("CONTENU de la BDD");
				//iteration de lignes du tableau "tb_task"
				while (rs.next()) {
					System.out.println("la valeur de column1(title)="+rs.getString("title"));
				
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
	}

}
