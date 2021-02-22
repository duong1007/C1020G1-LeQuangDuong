package model.repository.customer;

import model.bean.Customer;
import model.repository.ConnRepository;
import model.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImp implements Repository<Customer> {


    private static final String SQL_READ_ALL = "select `name`,price,discount,amount from product";
    private static final String SQL_CREATE ="insert into product (`name`,price,discount,amount) values (?,?,?,?);";
    ConnRepository connRepository = new ConnRepository();


    @Override
    public void create(Customer customer) {
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getBirth());
            preparedStatement.setString(3,customer.getPhone());
            preparedStatement.setString(4,customer.getEmail());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> readAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_READ_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String price = resultSet.getString("price");
                String discount = resultSet.getString("discount");
                String amount = resultSet.getString("amount");
                Customer customer = new Customer(name,price,discount,amount,"1");
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
