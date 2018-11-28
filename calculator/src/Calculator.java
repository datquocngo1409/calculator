import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/calculator")
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String operatorString = request.getParameter("operator");
        double first = Double.parseDouble(firstString);
        double second = Double.parseDouble(secondString);
        double result = 0;
        if (operatorString.equals("add")) result = first + second;
        if (operatorString.equals("sub")) result = first - second;
        if (operatorString.equals("mul")) result = first * second;
        if (operatorString.equals("div")) result = first / second;
        writer.println(
                "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <title>Simple Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<form action=\"/calculator\" method=\"post\">\n" +
                        "  <h2>Simple Calculator</h2>\n" +
                        "  <div>\n" +
                        "    First Operand: <br>\n" +
                        "    <input height=\"30\" width=\"300\" name=\"first\" placeholder=\"First Operand\" value = \"" + first + "\">\n" +
                        "    <br> Operator: <br>\n" +
                        "    <select name = \"operator\">\n" +
                        "      <option>add</option>\n" +
                        "      <option>sub</option>\n" +
                        "      <option>mul</option>\n" +
                        "      <option>div</option>\n" +
                        "    </select>\n" +
                        "    <br>\n" +
                        "    Second Operand: <br>\n" +
                        "    <input height=\"30\" width=\"300\" name=\"second\" placeholder=\"Second Operand\" value = \"" + second + "\">\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" height=\"30\" width=\"60\" name=\"submit\" placeholder=\"SUBMIT\">\n <br>\n" +
                        "    <input height=\"30\" width=\"300\" name=\"result\" placeholder=\"result\" value = \"" + result + "\">\n" +
                        "  </div>\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println(
                "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <title>Simple Calculator</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<form action=\"/calculator\" method=\"post\">\n" +
                        "  <h2>Simple Calculator</h2>\n" +
                        "  <div>\n" +
                        "    First Operand: <br>\n" +
                        "    <input height=\"30\" width=\"300\" name=\"first\" placeholder=\"First Operand\">\n" +
                        "    <br> Operator: <br>\n" +
                        "    <select name = \"operator\">\n" +
                        "      <option>add</option>\n" +
                        "      <option>sub</option>\n" +
                        "      <option>mul</option>\n" +
                        "      <option>div</option>\n" +
                        "    </select>\n" +
                        "    <br>\n" +
                        "    Second Operand: <br>\n" +
                        "    <input height=\"30\" width=\"300\" name=\"second\" placeholder=\"Second Operand\">\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" height=\"30\" width=\"60\" name=\"submit\" placeholder=\"SUBMIT\">\n" +
                        "  </div>\n" +
                        "</form>\n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
