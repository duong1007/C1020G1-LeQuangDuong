package model.repository.sevice_furama;

import model.bean.ServiceFurama;
import model.repository.ConnRepository;
import model.repository.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ServiceFuramaRepositoryImp implements Repository<ServiceFurama> {

    private static final String SQL_CREATE = "insert into sevice (sevice_name," +
            "sevice_area," +
            "sevice_cost," +
            "sevice_max_people," +
            "rent_type_id," +
            "service_type_id," +
            "standard_room," +
            "description_other_convenience," +
            "pool_area," +
            "number_of_floors) values (?,?,?,?,?,?,?,?,?,?)";
    ConnRepository  connRepository = new ConnRepository();

    @Override
    public void create(ServiceFurama serviceFurama) {
        try {
            PreparedStatement preparedStatement = this.connRepository.getConnection().prepareStatement(SQL_CREATE);
            preparedStatement.setString(1,serviceFurama.getName());
            preparedStatement.setInt(2,serviceFurama.getArea());
            preparedStatement.setDouble(3,serviceFurama.getCost());
            preparedStatement.setInt(4,serviceFurama.getMaxPeople());
            preparedStatement.setString(5,serviceFurama.getRentType());
            preparedStatement.setString(6,serviceFurama.getServiceType());
            preparedStatement.setString(7,serviceFurama.getStandardRoom());
            preparedStatement.setString(8,serviceFurama.getDescription());
            preparedStatement.setDouble(9,serviceFurama.getPoolArea());
            preparedStatement.setInt(10,serviceFurama.getNumberOfFloors());


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ServiceFurama> readAll() {
        return null;
    }

    @Override
    public boolean update(ServiceFurama serviceFurama) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public ServiceFurama findById(int id) {
        return null;
    }

    @Override
    public List<ServiceFurama> findByName(String name) {
        return null;
    }
}
