package com.hendisantika.springbootquerydsl.repository;

import com.hendisantika.springbootquerydsl.domain.QUser;
import com.hendisantika.springbootquerydsl.domain.User;
import com.mysema.query.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-querydsl
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/05/18
 * Time: 07.18
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> findUserByUsernameAndEmail(String username, String email) {

        QUser qUser = QUser.user;

        JPAQuery query = new JPAQuery(entityManager).from(qUser);

        if (username != null && !username.isEmpty()) {
            query.where(qUser.username.containsIgnoreCase(username));
        }

        if (email != null && !email.isEmpty()) {
            query.where(qUser.email.containsIgnoreCase(email));
        }

        return query.list(qUser);
    }
}