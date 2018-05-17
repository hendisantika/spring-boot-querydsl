package com.hendisantika.springbootquerydsl.domain;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-querydsl
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/05/18
 * Time: 05.11
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@ToString
@NoArgsConstructor

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;


    @Column(name = "username")
    private String username;


    @Column(name = "email")
    private String email;


}