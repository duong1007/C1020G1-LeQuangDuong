package controller;


import model.bean.Contract;
import model.service.ContractService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContractServlet",urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    
    private ContractService contractService = new ContractService();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        create(request,response);

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {

         String startDate = request.getParameter("start");
         String endDate = request.getParameter("end") ;
         String deposit = request.getParameter("deposit");
         String total = request.getParameter("total");
         String employee = request.getParameter("employee");
         String customer = request.getParameter("customer");
         String service = request.getParameter("service");

        Contract contract = new Contract(startDate,endDate,deposit,total,employee,customer,service);

         contractService.create(contract);
         response.sendRedirect("index.jsp");

    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        showCreate(request,response);

    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("contract/create.jsp").forward(request,response);
    }


}
