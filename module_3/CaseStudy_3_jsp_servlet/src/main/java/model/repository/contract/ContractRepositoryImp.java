package model.repository.contract;


import model.bean.Contract;
import model.repository.ConnRepository;
import model.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ContractRepositoryImp implements Repository<Contract> {

    private final String SQL_CREATE = "insert into contract (contract_start_date,contract_end_date,contract_debosit," +
            "contract_total_money,employee_id,customer_id,sevice_id) values (?,?,?,?,?,?,?)";

    ConnRepository connRepository = new ConnRepository();

    @Override
    public void create(Contract contract) {
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,contract.getStartDate());
            preparedStatement.setString(2,contract.getEndDate());
            preparedStatement.setString(3,contract.getDeposit());
            preparedStatement.setString(4,contract.getTotal());
            preparedStatement.setString(5,contract.getEmployee());
            preparedStatement.setString(6,contract.getCustomer());
            preparedStatement.setString(7,contract.getService());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contract> readAll() {
        return null;
    }

    @Override
    public boolean update(Contract contract) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Contract findById(int id) {
        return null;
    }

    @Override
    public List<Contract> findByName(String name) {
        return null;
    }
}
