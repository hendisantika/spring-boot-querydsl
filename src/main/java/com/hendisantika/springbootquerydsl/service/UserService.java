package com.hendisantika.springbootquerydsl.service;

import com.hendisantika.springbootquerydsl.domain.Admin;
import com.hendisantika.springbootquerydsl.domain.User;

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
public interface UserService {
    List<User> findUsersByUsernameAndEmail(String username, String email);

    List<Admin> findAdminByUsernameAndEmail(String username, String email);
}
