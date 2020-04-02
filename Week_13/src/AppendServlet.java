import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// This is a simple servlet example of inputting in field data by using a set of parameters from index (fname, lname).
public class AppendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Sets the String parameters for index.html
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='blue'><h2>");

		// If firstname and lastname are not null, then output lastname + firstname.
		if (!firstname.isEmpty() && !lastname.isEmpty()) {
			String fullname = lastname + ", " + firstname;
			out.println(fullname);

		// If firstname and lastname are null, prints a message to fill in the fields.
		} else {
			out.println("Please fill in the fields with your first and last name.");
		}

		out.println("</h2></body></html>");

	}

}