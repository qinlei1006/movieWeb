package com.lovo.web.service;

import com.lovo.web.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("userService")
public interface IUserService {

    /**
     * 根据用户名和密码查询用户
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("/userInfo/{userName}{password}")
    UserEntity userInfo(@PathVariable("userName")String userName
                        , @PathVariable("password")String password);
}
