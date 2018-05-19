package com.hendisantika.springbootquerydsl.repository;

import com.hendisantika.springbootquerydsl.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-querydsl
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/05/18
 * Time: 07.16
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    List<Admin> findByUsernameAndEmail(String username, String email);

}
