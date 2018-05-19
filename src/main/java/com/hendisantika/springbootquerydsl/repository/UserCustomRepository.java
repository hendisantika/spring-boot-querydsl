package com.hendisantika.springbootquerydsl.repository;

import com.hendisantika.springbootquerydsl.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-querydsl
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/05/18
 * Time: 07.17
 * To change this template use File | Settings | File Templates.
 */
public interface UserCustomRepository {

    List<User> findUserByUsernameAndEmail(String username, String email);

}
