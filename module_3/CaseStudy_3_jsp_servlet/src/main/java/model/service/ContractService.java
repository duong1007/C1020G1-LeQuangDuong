package model.service;

import model.bean.Contract;
import model.repository.Repository;
import model.repository.contract.ContractRepositoryImp;

import java.util.List;

public class ContractService implements Repository<Contract> {

    Repository<Contract> contractRepository = new ContractRepositoryImp();

    @Override
    public void create(Contract contract) {
        contractRepository.create(contract);
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
