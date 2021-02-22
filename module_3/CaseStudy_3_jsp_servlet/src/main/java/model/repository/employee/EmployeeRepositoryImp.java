package model.repository.employee;

import model.bean.Customer;
import model.bean.Employee;
import model.repository.ConnRepository;
import model.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements Repository<Employee> {

    private static final String SQL_READ = "select * from employee_view;";
    private static final String SQL_UPDATE = "update employee set " +
            "employee_name = ?, " +
            "employee_birthday = ?, " +
            "employee_id_card = ?, " +
            "employee_salary = ?, " +
            "employee_phone = ?, " +
            "employee_email = ?, " +
            "employee_address = ?, " +
            "position_id = ?, " +
            "education_degree_id = ?, " +
            "division_id = ? " +
            "where employee_id = ?;";

    private static final String SQL_FIND_BY_ID = "select * from employee where employee_id = ?;";
    private static final String SQL_DELETE = "delete from employee where employee_id = ?;" ;

    private final String SQL_CREATE = "insert into employee " +
            "(employee_name,employee_birthday,employee_id_card," +
            "employee_salary,employee_phone,employee_email," +
            "employee_address,position_id,education_degree_id,division_id)" + " values (?,?,?,?,?,?,?,?,?,?);";

    private final String SQL_FINd_BY_NAME = "select * from employee_view where employee_name like ?;";

    ConnRepository connRepository = new ConnRepository();

    @Override
    public void create(Employee employee) {
        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getCard());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setString(8,employee.getPosition());
            preparedStatement.setString(9,employee.getEducation());
            preparedStatement.setString(10,employee.getDivision());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> readAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            Statement statement = this.connRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_READ);

            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("employee_id"));
                String name = resultSet.getString("employee_name");
                String position = resultSet.getString("position_name");
                String birth = resultSet.getString("employee_birthday");
                String education = resultSet.getString("education_degree_name");
                String division = resultSet.getString("division_name");

                Employee employee = new Employee(id,name,birth,position,education,division);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public boolean update(Employee employee) {
        boolean result = false;
        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getCard());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setString(8,employee.getPosition());
            preparedStatement.setString(9,employee.getEducation());
            preparedStatement.setString(10,employee.getDivision());
            preparedStatement.setString(11, String.valueOf(employee.getId()));

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
    public Employee findById(int id) {
        Employee employee = new Employee();

        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setString(1, String.valueOf(id));

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employee.setId(id);
                employee.setName(resultSet.getString("employee_name"));
                employee.setBirthday(resultSet.getString("employee_birthday"));
                employee.setCard(resultSet.getString("employee_id_card"));
                employee.setSalary(resultSet.getDouble("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_email"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setPosition(resultSet.getString("position_id"));
                employee.setEducation(resultSet.getString("education_degree_id"));
                employee.setDivision(resultSet.getString("division_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_FINd_BY_NAME );
            preparedStatement.setString(1,"%" + name + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                employee.setId(Integer.parseInt(resultSet.getString("employee_id")));
                employee.setName(resultSet.getString("employee_name"));
                employee.setBirthday(resultSet.getString("employee_birthday"));
                employee.setPosition(resultSet.getString("position_name"));
                employee.setEducation(resultSet.getString("education_degree_name"));
                employee.setDivision(resultSet.getString("division_name"));

                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
