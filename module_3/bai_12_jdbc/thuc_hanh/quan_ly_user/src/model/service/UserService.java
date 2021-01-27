package model.service;

import model.bean.User;
import model.repository.IUserRepository;
import model.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserRepository {

    private UserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) throws SQLException {
        userRepository.insertUser(user);

    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public List<User> selectCountryUsers(String country) {
        return userRepository.selectCountryUsers(country);
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }
}
