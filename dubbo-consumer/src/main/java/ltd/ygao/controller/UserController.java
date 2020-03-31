package ltd.ygao.controller;

import ltd.ygao.pojo.User;
import ltd.ygao.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import java.util.List;

/**
 * @author Kevin
 * @version 1.0
 * @date 2020/3/31 9:53
 */
@RestController
public class UserController {
    @Reference
    UserService userService;
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        System.out.println("我进来了");
        List<User> allUser = userService.findAllUser();
        return allUser;
    }
}
