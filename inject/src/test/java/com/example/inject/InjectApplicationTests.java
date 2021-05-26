package com.example.inject;

import com.example.inject.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectApplicationTests {

    @Autowired
    private User user;

    @Test
    void contextLoads() {
    }
    @Test
    public void test(){

        System.out.println(user);

    }




}
