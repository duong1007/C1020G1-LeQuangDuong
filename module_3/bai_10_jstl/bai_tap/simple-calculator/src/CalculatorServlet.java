import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numberOne = Integer.parseInt(request.getParameter("numberOne"));
        int numberTwo = Integer.parseInt(request.getParameter("numberTwo"));
        String operator = request.getParameter("operator");

        String result = Operator.Calculator(operator,numberOne,numberTwo);

        request.setAttribute("result",result);
        request.setAttribute("numberOne",numberOne);
        request.setAttribute("numberTwo",numberTwo);
        request.setAttribute("operator",operator);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
}
