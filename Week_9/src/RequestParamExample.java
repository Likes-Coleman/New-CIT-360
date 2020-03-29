import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/* This is a simple servlet example with parameters for entering in the username.
This servlet interacts with Apache Tomcat 9.0.*/
public class RequestParamExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request Parameters Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Parameters Username Test</h3>");
        out.println("Parameters in this request:<br>");

        if (firstName != null || lastName != null) {
            out.println("First Name:");
            out.println(" = " + HTMLFilter.filter(firstName) + "<br>");
            out.println("Last Name:");
            out.println(" = " + HTMLFilter.filter(lastName));
        } 
        
        else {
            out.println("There are no current Parameters. Please enter in some.");
        }

        out.println("<P>");
        out.print("<form action=\"");
        out.print("RequestParamExample\" ");
        out.println("method=POST>");
        out.println("First Name:");
        out.println("<input type=text size=20 name=firstname>");
        out.println("<br>");
        out.println("Last Name:");
        out.println("<input type=text size=20 name=lastname>");
        out.println("<br>");
        out.println("<input type=submit>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse res) 
    throws IOException, ServletException {
        doGet(request, response);
    }
}