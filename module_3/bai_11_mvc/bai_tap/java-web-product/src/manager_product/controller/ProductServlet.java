package manager_product.controller;


import manager_product.model.bean.Product;
import manager_product.model.service.ProductService;
import manager_product.model.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"","/products"})
public class ProductServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "creat":
                creatProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "creat":
                showCreatProduct(request,response);
                break;
            case "edit":
                showEditProduct(request,response);
                break;
            case "delete":
                showDeleteProduct(request,response);
                break;
            case "view":
                showOneProduct(request,response);
                break;
            case "search":
                showProductSearch(request,response);
                break;
            default:
                showProduct(request,response);
                break;
        }
    }

    private void showProductSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("searchName");
        List<Product> productList = this.productService.findAll();
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                products.add(product);
            }
        }
        request.setAttribute("products",products);
        request.getRequestDispatcher("product/list.jsp").forward(request,response);
    }

    private void showOneProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if(product == null){
             request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("product/view.jsp").forward(request,response);
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            this.productService.delete(id);
        }

        response.sendRedirect("/products");
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("product/delete.jsp").forward(request,response);
        }

    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String manufacture = request.getParameter("manufacture");
        String img = request.getParameter("img");
        Product product = this.productService.findById(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            product.setManufacture(manufacture);
            product.setImg(img);
            this.productService.update(id, product);
            showProduct(request,response);
//            request.setAttribute("product", product);
//            request.getRequestDispatcher("product/edit.jsp").forward(request,response);
        }
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request,response);
        } else {
            request.setAttribute("product", product);
            request.getRequestDispatcher("product/edit.jsp").forward(request,response);
        }
    }
    private void creatProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String manufacture = request.getParameter("manufacture");
        String img = request.getParameter("img");
        int id = (int)(Math.random() * 10000);

        Product product = new Product(id,name,price,description,manufacture,img);
        this.productService.save(product);
        showProduct(request,response);

    }

    private void showCreatProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/creat.jsp").forward(request,response);
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productService.findAll();

        request.setAttribute("products",products);
        request.getRequestDispatcher("product/list.jsp").forward(request,response);
    }
}
