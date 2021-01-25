import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"","/customer"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvNwoTjChO0S88eHdqwAJdnpMrIEV0N7hlow&usqp=CAU"));
        customerList.add(new Customer("Nguyễn Văn Nam","1972-08-12","Bắc Giang","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFhDT-2fwAFur8hCe_pNAWkyOP2hg3Ndlk1w&usqp=CAU"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1918-06-20","Nam Định","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-Jk75cVLw9wFU-PUo-G0CfOBRwTKXGG4hRQ&usqp=CAU"));
        customerList.add(new Customer("Trần Đăng Khoa","1998-08-10","Hà Tây","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6Z2lZLeGORcnE30NaGDqn55yFYnVFjhii3Q&usqp=CAU"));
        customerList.add(new Customer("Nguyễn Đình Thi","1954-01-20","Hà Nội","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLrO3nO2RqWZExzr5l2KLzr2-Qzr6VwjgIQw&usqp=CAU"));


        request.setAttribute("customers", customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
