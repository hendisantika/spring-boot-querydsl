package com.hendisantika.springbootquerydsl.service;

import com.hendisantika.springbootquerydsl.domain.Admin;
import com.hendisantika.springbootquerydsl.domain.User;
import com.hendisantika.springbootquerydsl.repository.AdminRepository;
import com.hendisantika.springbootquerydsl.repository.UserCustomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-querydsl
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/05/18
 * Time: 21.49
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserCustomRepository userCustomRepository;


    @Override
    public List<User> findUsersByUsernameAndEmail(String username, String email) {

        return userCustomRepository.findUserByUsernameAndEmail(username, email);
    }

    @Override
    public List<Admin> findAdminByUsernameAndEmail(String username, String email) {
        return adminRepository.findByUsernameAndEmail(username, email);
    }
}
