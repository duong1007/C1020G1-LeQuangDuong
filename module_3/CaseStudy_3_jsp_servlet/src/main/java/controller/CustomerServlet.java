package controller;

import model.bean.Customer;
import model.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet", urlPatterns = {"","/customers"})
public class CustomerServlet extends javax.servlet.http.HttpServlet {

    private CustomerService customerService = new CustomerService();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                create(request,response);
                break;
            case "read":
                break;
            case "update":
                updateCustomer(request,response);
                break;
            default:
                showCustomer(request,response);
                break;
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreate(request,response);
                break;
            case "read":
                break;
            case "update":
                showUpdate(request,response);
                break;
            case "delete":
                break;
            case "find":
                break;
            default:
                showCustomer(request,response);
                break;
        }

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String date = request.getParameter("birth");
        String gender = request.getParameter("gender");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(type,name,date,gender,card,phone,email,address);
        customerService.create(customer);

        request.getRequestDispatcher("customer/display.jsp").forward(request,response);

    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);

        request.setAttribute("customer",customer);
        request.getRequestDispatcher("customer/update.jsp").forward(request,response);
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String date = request.getParameter("birth");
        String gender = request.getParameter("gender");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id,type,name,date,gender,card,phone,email,address);
        customerService.update(customer);

        showCustomer(request,response);
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = customerService.readAll();
        request.setAttribute("customers",customers);
        request.getRequestDispatcher("customer/display.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("customer/create.jsp").forward(request,response);
    }
}
