package com.hendisantika.springbootquerydsl;

import com.hendisantika.springbootquerydsl.domain.Admin;
import com.hendisantika.springbootquerydsl.domain.User;
import com.hendisantika.springbootquerydsl.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringBootQuerydslApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuerydslApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) {
        // Test code

        List<Admin> admins = userService.
                findAdminByUsernameAndEmail("steve_jobs", "sjobs@apple.com");

        List<User> users = userService.
                findUsersByUsernameAndEmail("jeff_bezos", "jbezos@amazon.com");


        log.info("{}", admins.toString());
        log.info("{}", users.toString());

    }
}
