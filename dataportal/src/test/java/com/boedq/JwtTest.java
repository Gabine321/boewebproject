package com.boedq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boedq.modules.app.utils.JwtUtils;

import io.jsonwebtoken.Claims;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JwtTest {
    @Autowired
    private JwtUtils jwtUtils;

    @Test
    public void test() {
        String token = jwtUtils.generateToken(1);

        System.out.println("token码为: " + token);
        
        Claims claims=jwtUtils.getClaimByToken(token);
        System.out.println("claims为: " + claims);
    }

}
