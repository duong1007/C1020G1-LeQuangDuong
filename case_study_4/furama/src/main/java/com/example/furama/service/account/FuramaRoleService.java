package com.example.furama.service.account;

import com.example.furama.model.account.FuramaRole;
import com.example.furama.service.MainService;


public interface FuramaRoleService extends MainService<FuramaRole> {
    FuramaRole findByName(String name);
}
