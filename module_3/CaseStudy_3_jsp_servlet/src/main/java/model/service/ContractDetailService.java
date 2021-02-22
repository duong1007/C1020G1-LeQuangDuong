package model.service;

import model.bean.ContractDetail;
import model.repository.Repository;
import model.repository.contract.ContractRepositoryImp;
import model.repository.contract_detail.ContractDetailRepositoryImp;

import java.util.List;

public class ContractDetailService implements Repository<ContractDetail> {

    Repository<ContractDetail> contractDetailRepository = new ContractDetailRepositoryImp();

    @Override
    public void create(ContractDetail contractDetail) {
        contractDetailRepository.create(contractDetail);
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
