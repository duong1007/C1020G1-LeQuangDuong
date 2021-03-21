package com.example.furama.service.account;

import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import com.example.furama.service.MainService;

import java.util.List;

public interface FuramaUserRoleService extends MainService<FuramaUserRole> {
    List<FuramaUserRole> findAllByFuramaUser(FuramaUser furamaUser);
}
