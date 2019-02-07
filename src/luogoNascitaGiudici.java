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
public class luogoNascitaGiudici extends HttpServlet {
 
   private String message;
   private String connectionUrl = "jdbc:sqlserver://213.140.22.237\\SQLEXPRESS:1433;databaseName=XFactor;user=titze.walter;password=galvani@2018";

   public void init() throws ServletException {
      // Do required initialization
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			    
	  response.setContentType("text/html");
	  
	  RequestDispatcher view = request.getRequestDispatcher("formRicercaGiudice.jsp");      
      view.forward(request, response);
		
	}
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");
      
      // accesso a database XFactor
      try {
          
            // l'istruzione seguente è fondamentale altrimenti non viene caricato il driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
			// Load SQL Server JDBC driver and establish connection.
            Connection connection = DriverManager.getConnection(connectionUrl);
			String luogo = request.getParameter("luogo");
			String sql = "SELECT * FROM Giudice where LuogoDiNascita = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			
            stmt.setString(1, luogo);
            
            ResultSet rs = stmt.executeQuery();
	        
	        message = "Giudici nati a " + luogo + ": <br>";
			while(rs.next()){
				//Retrieve by column name
				String first = rs.getString("Nome");
				String last = rs.getString("Cognome");
                
                message += first + " " + last + "<br>";

          }
	        rs.close();
	        connection.close();
		} catch (Exception e) {
		    
			message = "Ci sono stati dei problemi, riprova e controlla di aver scritto tutto <b>correttamente</b>.";
		}
      
      // Set response content type
      response.setContentType("text/html");     
      // Actual logic goes here.
      request.setAttribute("message", message);              
      RequestDispatcher view = request.getRequestDispatcher("risposta.jsp");      
      view.forward(request, response);
   }

   public void destroy() {
      // do nothing.
   }
}