
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;   
public class ServletLink extends HttpServlet 
{   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{     
		response.setContentType("text/html");     
		PrintWriter out = response.getWriter();           
		String html = HtmlFactory.head("Test page");     
		html += "\t<body>\n";     
		html += "\t\t<h1>This is test page</h1>\n";     
		html += "\t\t<br />\n";     
		html += "\t\t<a href=\"/test\"><< go back to index page</a>\n";     
		html += "\t</body>\n";     
		html += "</html>";       
		out.println(html);   
		} 
	}
