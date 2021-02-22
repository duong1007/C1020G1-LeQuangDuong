package controller;


import model.bean.ServiceFurama;
import model.service.ServiceFuramaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServiceFuramaServlet",urlPatterns = "/service")
public class ServiceFuramaServlet extends HttpServlet {

    private ServiceFuramaService service = new ServiceFuramaService();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        if ("createVilla".equals(action)) {
            createVilla(request, response);
        } else {
            create(request, response);
        }

    }



    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        if ("createVilla".equals(action)) {
            showCreateVilla(request, response);
        } else {
            showCreate(request, response);
        }

    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String serviceType = request.getParameter("serviceType");
        request.setAttribute("serviceType",serviceType);
        request.getRequestDispatcher("service_furama/create.jsp").forward(request,response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        String serviceType = request.getParameter("serviceType");
        String rentType = request.getParameter("rentType");
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        int numberFloors = Integer.parseInt(request.getParameter("numberFloors"));


        ServiceFurama serviceFurama = new ServiceFurama(name,area,cost,maxPeople,serviceType,rentType,standardRoom,
                description,numberFloors);
        service.create(serviceFurama);

        response.sendRedirect("index.jsp");
    }

    private void createVilla(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        double cost = Double.parseDouble(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        String serviceType = request.getParameter("serviceType");
        String rentType = request.getParameter("rentType");
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int numberFloors = Integer.parseInt(request.getParameter("numberFloors"));


        ServiceFurama serviceFurama = new ServiceFurama(name,area,cost,maxPeople,serviceType,rentType,standardRoom,description,poolArea,numberFloors);
        service.create(serviceFurama);

        response.sendRedirect("index.jsp");
    }


    private void showCreateVilla(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String serviceType = request.getParameter("serviceType");
        request.setAttribute("serviceType",serviceType);
        request.getRequestDispatcher("service_furama/createVilla.jsp").forward(request,response);
    }
}
