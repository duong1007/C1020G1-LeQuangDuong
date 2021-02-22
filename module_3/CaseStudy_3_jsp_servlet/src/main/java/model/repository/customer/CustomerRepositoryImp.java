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

    private static final String SQL_READ = "select * from customer_view";
    private static final String SQL_UPDATE = "update customer set customer_type_id = ?, " +
            "customer_name = ?, " +
            "customer_birthday = ?, " +
            "customer_gender = ?, " +
            "customer_id_card = ?, " +
            "customer_phone = ?, " +
            "customer_email = ?, " +
            "customer_address = ? " +
            "where customer_id = ?";

    private static final String SQL_FIND_BY_ID = "select * from customer where customer_id = ?";
    private static final String SQL_DELETE = "delete from customer where customer_id = ?" ;

    private final String SQL_CREATE = "insert into customer " +
            "(customer_type_id,customer_name,customer_birthday," +
            "customer_gender,customer_id_card,customer_phone," +
            "customer_email,customer_address)" + " values (?,?,?,?,?,?,?,?)";

    private final String SQL_FINd_BY_NAME = "select * from customer_view where customer_name like ?";


    ConnRepository connRepository = new ConnRepository();


    @Override
    public void create(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,customer.getTypeID());
            preparedStatement.setString(2,customer.getName());
            preparedStatement.setString(3,customer.getBirth());
            preparedStatement.setString(4,customer.getGender());
            preparedStatement.setString(5,customer.getIdCard());
            preparedStatement.setString(6,customer.getPhone());
            preparedStatement.setString(7,customer.getEmail());
            preparedStatement.setString(8,customer.getAddress());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> readAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            Statement statement = this.connRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_READ);

            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("customer_id"));
                String name = resultSet.getString("customer_name");
                String gender = resultSet.getString("customer_gender");
                String birth = resultSet.getString("customer_birthday");
                String type = resultSet.getString("customer_type_name");

                Customer customer = new Customer(id,type,name,birth,gender);
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }


    @Override
    public boolean update(Customer customer) {
        boolean result = false;
        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1,customer.getTypeID());
            preparedStatement.setString(2,customer.getName());
            preparedStatement.setString(3,customer.getBirth());
            preparedStatement.setString(4,customer.getGender());
            preparedStatement.setString(5,customer.getIdCard());
            preparedStatement.setString(6,customer.getPhone());
            preparedStatement.setString(7,customer.getEmail());
            preparedStatement.setString(8,customer.getAddress());
            preparedStatement.setString(9, String.valueOf(customer.getId()));

            result = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_DELETE);
            preparedStatement.setString(1, String.valueOf(id));
            
            result = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = new Customer();

        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setString(1, String.valueOf(id));

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                customer.setId(id);
                customer.setAddress(resultSet.getString("customer_address"));
                customer.setBirth(resultSet.getString("customer_birthday"));
                customer.setEmail(resultSet.getString("customer_email"));
                customer.setGender(resultSet.getString("customer_gender"));
                customer.setIdCard(resultSet.getString("customer_id_card"));
                customer.setName(resultSet.getString("customer_name"));
                customer.setPhone(resultSet.getString("customer_phone"));
                customer.setTypeID(resultSet.getString("customer_type_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_FINd_BY_NAME );
            preparedStatement.setString(1,"%" + name + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                customer.setId(Integer.parseInt(resultSet.getString("customer_id")));
                customer.setName(resultSet.getString("customer_name"));
                customer.setGender(resultSet.getString("customer_gender"));
                customer.setBirth(resultSet.getString("customer_birthday"));
                customer.setTypeID(resultSet.getString("customer_type_name"));

                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
