// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;


// Extend HttpServlet class
public class listaGiudiciAnni extends HttpServlet {
 
   private String message;
   private String connectionUrl = "jdbc:sqlserver://213.140.22.237\\SQLEXPRESS:1433;databaseName=XFactor;user=titze.walter;password=galvani@2018";

   public void init() throws ServletException {
      // Do required initialization
      message = "Lista dei giudici di XFactor che hanno più di una certa età:<br>";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");
      
      RequestDispatcher view = request.getRequestDispatcher("formListaGiudiciAnni.jsp");      
      view.forward(request, response);
      
      message = "Lista dei giudici che hanno più di " + request.getParameter("anni") +  " anni: <br>";
      
      }
      // accesso a database XFactor
      public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");
      
      
      try {
          
            // l'istruzione seguente è fondamentale altrimenti non viene caricato il driver
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
			// Load SQL Server JDBC driver and establish connection.
            Connection connection = DriverManager.getConnection(connectionUrl);
            String anni = request.getParameter("anni");
			String sql = "SELECT * FROM Giudice WHERE (DateDiff(year, DataDiNascita, GETDATE())) > ? ORDER BY Nome ASC";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			
            stmt.setString(1, anni);
			ResultSet rs = stmt.executeQuery();
			
			message = "Lista dei giudici che hanno piu di " + anni + " anni: <br>";
			while(rs.next()){
				//Retrieve by column name
				String first = rs.getString("Nome");
				String last = rs.getString("Cognome");
                String lu = rs.getString("LuogoDiNascita");
                message += first + " " + last + " nato a " + lu + ".<br>";

	        }
	        rs.close();
	        connection.close();
		} catch (Exception e) {
		    
			message = "Ci sono stati dei problemi, riprova e controlla di aver scritto tutto <b>correttamente</b>.";
		}
      
      // Set response content type
      request.setAttribute("message", message);              
      RequestDispatcher view = request.getRequestDispatcher("risposta.jsp");      
      view.forward(request, response);
   }

   public void destroy() {
      // do nothing.
   }
}
