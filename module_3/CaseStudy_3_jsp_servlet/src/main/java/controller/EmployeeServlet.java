package controller;

import model.bean.Employee;
import model.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

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
                updateEmployee(request,response);
                break;
            default:
                showEmployee(request,response);
                break;

        }

    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
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
                deleteEmployee(request,response);
                break;
            case "Search":
                findByName(request,response);
                break;
            default:
                showEmployee(request,response);
                break;
        }

    }

    private void findByName(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Employee> employees = employeeService.findByName(name);

        request.setAttribute("employees",employees);
        request.getRequestDispatcher("employee/display.jsp").forward(request,response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(id);

        showEmployee(request,response);

    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String date = request.getParameter("birth");
        String card = request.getParameter("card");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String education = request.getParameter("education");
        String division = request.getParameter("division");

        Employee employee = new Employee(name,date,card,salary,phone,email,address,position,education,division);
        employeeService.create(employee);

        showEmployee(request,response);

    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);

        request.setAttribute("employee",employee);
        request.getRequestDispatcher("employee/update.jsp").forward(request,response);
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String date = request.getParameter("birth");
        String card = request.getParameter("card");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String education = request.getParameter("education");
        String division = request.getParameter("division");

        Employee employee = new Employee(id,name,date,card,salary,phone,email,address,
                position,education,division);
        employeeService.update(employee);

        showEmployee(request,response);
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Employee> employees = employeeService.readAll();
        request.setAttribute("employees",employees);
        request.getRequestDispatcher("employee/display.jsp").forward(request,response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("employee/create.jsp").forward(request,response);
    }
}
