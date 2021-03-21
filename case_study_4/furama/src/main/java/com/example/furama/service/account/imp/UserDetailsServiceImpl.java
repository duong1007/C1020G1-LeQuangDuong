package com.example.furama.service.account.imp;


import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import com.example.furama.model.employee.Employee;
import com.example.furama.service.account.FuramaUserRoleService;
import com.example.furama.service.account.FuramaUserService;
import com.example.furama.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private FuramaUserService furamaUserService;

    @Autowired
    private FuramaUserRoleService furamaUserRoleService;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        FuramaUser furamaUser = this.furamaUserService.findById(userName);


        if (furamaUser == null) {

            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");

        }

        System.out.println("Found User: " + furamaUser);

        List<FuramaUserRole> userRoles = this.furamaUserRoleService.findAllByFuramaUser(furamaUser);

        List<GrantedAuthority> grantList = new ArrayList<>();
        if (userRoles != null) {
            for (FuramaUserRole userRole : userRoles) {
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getFuramaRole().getFuramaRoleName());
                grantList.add(authority);
            }
        }

        if (furamaUser.getEmployee() == null) {
            return (UserDetails) new User(furamaUser.getUsername(), furamaUser.getPassword(), grantList);
        }

        return (UserDetails) new User(furamaUser.getEmployee().getEmployeeName(), furamaUser.getPassword(), grantList);

    }

}