package model.service;

import model.bean.ServiceFurama;
import model.repository.Repository;
import model.repository.sevice_furama.ServiceFuramaRepositoryImp;

import java.util.List;

public class ServiceFuramaService implements Repository<ServiceFurama> {

    Repository<ServiceFurama> serviceFuramaRepository = new ServiceFuramaRepositoryImp();

    @Override
    public void create(ServiceFurama serviceFurama) {
        serviceFuramaRepository.create(serviceFurama);
    }

    @Override
    public List<ServiceFurama> readAll() {
        return serviceFuramaRepository.readAll();
    }

    @Override
    public boolean update(ServiceFurama serviceFurama) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return serviceFuramaRepository.delete(id);
    }

    @Override
    public ServiceFurama findById(int id) {
        return serviceFuramaRepository.findById(id);
    }

    @Override
    public List<ServiceFurama> findByName(String name) {
        return null;
    }
}
