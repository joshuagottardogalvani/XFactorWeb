// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;

// Extend HttpServlet class
public class cancellaGiudice extends HttpServlet {
 
   private String message;
   private String connectionUrl = "jdbc:sqlserver://213.140.22.237\\SQLEXPRESS:1433;databaseName=XFactor;user=titze.walter;password=galvani@2018";

   public void init() throws ServletException {
      // Do required initialization
   }
   
   public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			    
	  response.setContentType("text/html");
	  
	  RequestDispatcher view = request.getRequestDispatcher("formCancellaGiudice.jsp");      
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
			
			//inserimento di un nuovo giudice
            String cognome = request.getParameter("cognome");
            String sql4 = "DELETE FROM Giudice WHERE cognome = ? ";
            PreparedStatement prepStmt = connection.prepareStatement(sql4);
            prepStmt.setString(1, cognome);
            prepStmt.executeUpdate();
            message = "Giudice Eliminato";
	        connection.close();
		} catch (Exception e) {
		    
            message = "Ci sono stati dei problemi, riprova e controlla di aver scritto tutto <b>correttamente</b>.";    
		}
      
      /*
      // Set response content type
      response.setContentType("text/html");     
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println(message);
      */
     
      request.setAttribute("message", message);              
      RequestDispatcher view = request.getRequestDispatcher("risposta.jsp");      
      view.forward(request, response);
     
   }

   public void destroy() {
      // do nothing.
   }
}