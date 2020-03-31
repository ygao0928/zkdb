package ltd.ygao.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import ltd.ygao.mapper.UserMapper;
import ltd.ygao.pojo.User;
import ltd.ygao.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Kevin
 * @version 1.0
 * @date 2020/3/30 23:18
 */
@Service(timeout = 300)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAllUser() {
        List<User> allUser = userMapper.getAllUser();
        System.out.println("我到了实现层");
        return allUser;
    }
}
