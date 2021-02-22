package controller;

import model.bean.Contract;
import model.bean.ContractDetail;
import model.service.ContractDetailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContractDetailServlet",urlPatterns = "/contract_detail")
public class ContractDetailServlet extends HttpServlet {

    ContractDetailService contractDetailService = new ContractDetailService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        create(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        showCreate(request,response);


    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String contractID = request.getParameter("contractID");
        String attackService = request.getParameter("attackService") ;
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        ContractDetail contractDetail = new ContractDetail(contractID,attackService,quantity);

        contractDetailService.create(contractDetail);
        response.sendRedirect("index.jsp");

    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.getRequestDispatcher("contract_detail/create.jsp").forward(request,response);
    }
}
