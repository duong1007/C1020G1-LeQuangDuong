package model.repository;

import java.util.List;

public interface Repository<T> {

    void create(T t);

    List<T> readAll();

    boolean update(T t);

    boolean delete(int id);

    T findById(int id);

    List<T> findByName(String name);

}
