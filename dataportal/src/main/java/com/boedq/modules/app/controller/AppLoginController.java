package com.boedq.modules.app.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boedq.common.utils.R;
import com.boedq.common.validator.ValidatorUtils;
import com.boedq.modules.app.form.LoginForm;
import com.boedq.modules.app.service.UserService;
import com.boedq.modules.app.utils.JwtUtils;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/app")
@Api("APP登录接口")
public class AppLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtils jwtUtils;

    
    @PostMapping("login")
    @ApiOperation("登录")
    public R login(@RequestBody LoginForm form){
        
        ValidatorUtils.validateEntity(form);

        
        long userId = userService.login(form);

        
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return R.ok(map);
    }

}
