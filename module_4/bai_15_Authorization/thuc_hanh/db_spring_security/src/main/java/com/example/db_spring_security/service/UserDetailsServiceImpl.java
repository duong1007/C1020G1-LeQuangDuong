package com.example.db_spring_security.service;

import com.example.db_spring_security.model.User;
import com.example.db_spring_security.model.UserRole;
import com.example.db_spring_security.repository.UserRepository;
import com.example.db_spring_security.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user =userRepository.findByUserName(userName);

        if (user == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }

        List<UserRole> userRoles =userRoleRepository.findAllByUser(user);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(userRoles != null) {
            for (UserRole userRole : userRoles) {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userRole.getRole().getRoleName());
                grantedAuthorities.add(grantedAuthority);
            }
        }
        return (UserDetails) new
                org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),grantedAuthorities);
    }
}
