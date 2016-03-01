package team6;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/team6/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String isbn= request.getParameter("isbn");
		String aname=request.getParameter("aname");
		String bname=request.getParameter("btitle");
		String genre=request.getParameter("genre");
		
		String btnid=request.getParameter("btnid");
		String errornot="Sorry the value you are looking for is not found!";
		System.out.println(btnid);
		System.out.println(aname);
		//Setting Database
				System.out.println("Connecting to database");
				String JDBC_DRIVER="com.mysql.jdbc.Driver";  
			    String DB_URL="jdbc:mysql://localhost/misproject";
			    String USER = "root";
			    String PASS = "admin123";
				Connection c = null;
				
				if(btnid.equals("Add")){
					
					 try {
							System.out.println("Entered try loop");
							Class.forName("com.mysql.jdbc.Driver");
							 c = DriverManager.getConnection(DB_URL,USER,PASS);
					 //library
					    Statement   stmt = c.createStatement();
					    
					    String query="INSERT INTO books(isbn,authorname,title,genre) VALUES(?,?,?,?) ";
					    PreparedStatement prep = c.prepareStatement(query); // Setting the values which we got from JSP form
				         prep.setString(1, isbn); prep.setString(2, aname); 
				         prep.setString(3, bname);prep.setString(4, genre);
				         
				         prep.executeUpdate(); prep.close();
				         stmt.close();
				         c.close();
				         response.sendRedirect(	"Index.jsp");
					 }
				         catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
				        
					
				}
				
				else if(btnid.equals("Searchtitle")){
					
					 try {
							System.out.println("Entered try loop");
							Class.forName("com.mysql.jdbc.Driver");
							 c = DriverManager.getConnection(DB_URL,USER,PASS);
					 //library
					    Statement   stmt = c.createStatement();
					    
					    String query="SELECT isbn,authorname,title,genre FROM books WHERE title LIKE '%"+bname+"%'";
					    ResultSet  rs1 = stmt.executeQuery(query);
					    
					    ArrayList<Display> entries1 = new ArrayList<Display>();
						while (rs1.next()) {
							/*------*/System.out.println("Entring userlib loop");
							entries1.add(new Display(rs1.getString("isbn"),rs1.getString("authorname"),rs1.getString("title"),rs1.getString("genre")));

						}
						request.setAttribute("display", entries1);
						for(Display disp:entries1){
							System.out.println(disp.getIsbn());
						}
					    
					    
					    
				         stmt.close();
				         c.close();
				         request.getRequestDispatcher( "Displaysearch.jsp" ).forward(request,response);

					 }
				         catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
				        
					
				}
				
				else if(btnid.equals("Searchauthor")){
					
					 try {
							System.out.println("Entered try loop search author");
							Class.forName("com.mysql.jdbc.Driver");
							 c = DriverManager.getConnection(DB_URL,USER,PASS);
					 //library
					    Statement   stmt = c.createStatement();
					    
					    String query="SELECT isbn,authorname,title,genre FROM books WHERE authorname LIKE '%"+aname+"%'";
					    ResultSet  rs1 = stmt.executeQuery(query);
					    
					    ArrayList<Display> entries1 = new ArrayList<Display>();
						while (rs1.next()) {
							/*------*/System.out.println("Entring userlib loop");
							entries1.add(new Display(rs1.getString("isbn"),rs1.getString("authorname"),rs1.getString("title"),rs1.getString("genre")));

						}
						request.setAttribute("display", entries1);
						for(Display disp:entries1){
							System.out.println(disp.getIsbn());
						}
					    
					    
					    
				         stmt.close();
				         c.close();
				         
				        request.getRequestDispatcher( "Displaysearch.jsp" ).forward(request,response);

					 }
				         catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
				        
					
				}
				else if(btnid.equals("Searchisbn")){
					
					 try {
							System.out.println("Entered try loop search author");
							Class.forName("com.mysql.jdbc.Driver");
							 c = DriverManager.getConnection(DB_URL,USER,PASS);
					 //library
					    Statement   stmt = c.createStatement();
					    
					    String query="SELECT isbn,authorname,title,genre FROM books WHERE isbn = "+isbn;
					    ResultSet  rs1 = stmt.executeQuery(query);
					    
					    ArrayList<Display> entries1 = new ArrayList<Display>();
						while (rs1.next()) {
							/*------*/System.out.println("Entring userlib loop");
							entries1.add(new Display(rs1.getString("isbn"),rs1.getString("authorname"),rs1.getString("title"),rs1.getString("genre")));

						}
						request.setAttribute("display", entries1);
						for(Display disp:entries1){
							System.out.println(disp.getIsbn());
						}
					    
					    
					    
				         stmt.close();
				         c.close();
				         
				        request.getRequestDispatcher( "Displaysearch.jsp" ).forward(request,response);

					 }
				         catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
				        
					
				}
				else if(btnid.equals("View")){
					
					 try {
							System.out.println("Entered try loop");
							Class.forName("com.mysql.jdbc.Driver");
							 c = DriverManager.getConnection(DB_URL,USER,PASS);
					 //library
					    Statement   stmt = c.createStatement();
					    
					    String query="SELECT isbn,authorname,title,genre FROM books";
					    ResultSet  rs1 = stmt.executeQuery(query);
					    
					    ArrayList<Display> entries1 = new ArrayList<Display>();
						while (rs1.next()) {
							/*------*/System.out.println("Entring userlib loop");
							entries1.add(new Display(rs1.getString("isbn"),rs1.getString("authorname"),rs1.getString("title"),rs1.getString("genre")));

						}
						request.setAttribute("display", entries1);
						for(Display disp:entries1){
							System.out.println(disp.getIsbn());
						}
					    
					    
					    
				         stmt.close();
				         c.close();
				         request.getRequestDispatcher( "Displaysearch.jsp" ).forward(request,response);

					 }
				         catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
				        
					
				}
						
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
