package controller;

import model.bean.Customer;
import model.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends javax.servlet.http.HttpServlet {

    private CustomerService customerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                create(request,response);
                break;
            case "update":
                updateCustomer(request,response);
                break;
            default:
                showCustomer(request,response);
                break;

        }

    }
    public void TestRegex(String test) {
        test.matches("^(0|[(][+]84[)]) (90|91)([0-9]{7})$");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showCreate(request,response);
                break;
            case "update":
                showUpdate(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "Search":
                findByName(request,response);
                break;
            default:
                showCustomer(request,response);
                break;
        }

    }

    private void findByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Customer> customers = customerService.findByName(name);

        request.setAttribute("customers",customers);
        request.setAttribute("search","customers");
        request.getRequestDispatcher("customer/display.jsp").forward(request,response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);

        showCustomer(request,response);

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String date = request.getParameter("birth");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        Customer customer = new Customer(name,date,phone,email,"1");
        customerService.create(customer);

        showCustomer(request,response);

    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);

        request.setAttribute("search","customers");
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

//        Customer customer = new Customer(id,type,name,date,gender,card,phone,email,address);
//        customerService.update(customer);

        showCustomer(request,response);
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = customerService.readAll();

        request.setAttribute("customers",customers);
        request.setAttribute("search","customers");
        request.getRequestDispatcher("customer/display.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("search","customers");
        request.getRequestDispatcher("customer/create.jsp").forward(request,response);
    }
}
