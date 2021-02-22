package model.repository.contract_detail;

import model.bean.ContractDetail;
import model.repository.ConnRepository;
import model.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ContractDetailRepositoryImp implements Repository<ContractDetail> {

    private final String SQL_CREATE = "insert into contract_detail " +
            "(contract_id,attach_service_id,quantity) values (?,?,?)";


    ConnRepository connRepository = new ConnRepository();

    @Override
    public void create(ContractDetail contractDetail) {
        try {
            PreparedStatement preparedStatement = connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,contractDetail.getContractID());
            preparedStatement.setString(2,contractDetail.getContractID());
            preparedStatement.setString(3,contractDetail.getContractID());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ContractDetail> readAll() {
        return null;
    }

    @Override
    public boolean update(ContractDetail contractDetail) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public ContractDetail findById(int id) {
        return null;
    }

    @Override
    public List<ContractDetail> findByName(String name) {
        return null;
    }
}
