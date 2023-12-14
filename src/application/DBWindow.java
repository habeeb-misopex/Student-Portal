package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
* A JavaFX ConnectDB  Application
*/ public class DBWindow extends Application {
/**
* @param args the command line arguments
* 
* 	
*/
	private ArrayList<SimpleRecord> data;
	private String dbURL;
	private String dbUsername = "root";
	private String dbPassword = "1234";
	private String URL = "127.0.0.1";
	private String port = "3306";
	private String dbName = "university";
	private Connection con;
	
	public static void main(String[] args) {
			
		Application.launch(args);
	}


	@Override
	public void start(Stage stage) {
		stage.setTitle("University Database");
		BorderPane root = new BorderPane();
		
		Scene scene = new Scene(root, 1000, 600);

		try {
			
			getData(); //db get data put in array list ... after this done with DB
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		viewData(root); //javafx with arraylist.. throw them as text on borderpane
		drawLine(root); // draw blue line
		stage.setScene(scene);
		stage.show();
	}


	

	private void drawLine(BorderPane root) {
		
		// blue line
		Line blueLine = new Line(40, 35, 950, 35);
		blueLine.setStroke(Color.BLUE);
		blueLine.setStrokeWidth(2);
		root.getChildren().add(blueLine);
		
	}


	private void viewData(BorderPane root){
		
		int startx = 50, starty=50;
		int colW = 200, colH=20;
		ArrayList<String> cols = new ArrayList<String>();

		
		cols.add("Snum");
		cols.add("Name");
		cols.add("Major");
		cols.add("Level");
		cols.add("Age");
		
		// columns names on the window
		for (int i=0; i<5; i++)
			root.getChildren().add(
					new Text(startx + (colW * i),starty-colH ,cols.get(i)));
		
		//data
		for (int j = 0; j< (data.size()); j++)
			for (int i=0; i<5; i++)  {
				root.getChildren().add(new Text(startx + (colW * i),
						starty + j*colH, 
						data.get(j).getField(i+1)));
			}
			
		}


	private void getData() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String SQL;
		data = new ArrayList<>();
				
		connectDB();
		System.out.println("Connection established");

		SQL = "select * from student";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);


		while ( rs.next() )  {
			//SimpleRecord rd = ;
			data.add(new SimpleRecord(rs.getString(1),rs.getString(2),
					rs.getString(3),rs.getString(4), rs.getString(5)));
		}
		rs.close();
		stmt.close();

		con.close();
		System.out.println("Connection closed" + data.size());
		
		
	}


	private void connectDB() throws ClassNotFoundException, SQLException {
		
		dbURL = "jdbc:mysql://" + URL + ":" + port + "/" + dbName + "?verifyServerCertificate=false";
		Properties p = new Properties();
		p.setProperty("user", dbUsername);
		p.setProperty("password", dbPassword);
		p.setProperty("useSSL", "false");
		p.setProperty("autoReconnect", "true");
		Class.forName("com.mysql.jdbc.Driver");
	
		con = DriverManager.getConnection (dbURL, p);

	}

	
	
	private ArrayList<String> getColsNames() throws SQLException, ClassNotFoundException {
		
		ArrayList<String> cols = new ArrayList<>();
		String SQL;

		connectDB();
		System.out.println("Connection established");
		
		SQL = "show columns from student";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while ( rs.next() )
			cols.add(rs.getString(1));

		rs.close();
		stmt.close();
		con.close();
		System.out.println("Connection closed");
		return cols;
		

	}
		
}

	
		

