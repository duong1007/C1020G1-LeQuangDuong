package com.example.furama.service.account.imp;


import com.example.furama.model.account.FuramaUser;
import com.example.furama.model.account.FuramaUserRole;
import com.example.furama.repository.account.FuramaUserRepository;
import com.example.furama.repository.account.FuramaUserRoleRepository;
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
    private FuramaUserRepository furamaUserRepository;

    @Autowired
    private FuramaUserRoleRepository furamaUserRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        FuramaUser appUser = this.furamaUserRepository.findByUsername(userName);

        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }

        System.out.println("Found User: " + appUser);

        // [ROLE_USER, ROLE_ADMIN,..]
        List<FuramaUserRole> userRoles = this.furamaUserRoleRepository.findAllByFuramaUser(appUser);

        List<GrantedAuthority> grantList = new ArrayList<>();
        if (userRoles != null) {
            for (FuramaUserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getFuramaRole().getFuramaRoleName());
                grantList.add(authority);
            }
        }

        return (UserDetails) new User(appUser.getUsername(), //
                appUser.getPassword(), grantList);
    }

}