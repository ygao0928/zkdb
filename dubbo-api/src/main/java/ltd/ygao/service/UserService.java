package ltd.ygao.service;


import ltd.ygao.pojo.User;

import java.sql.SQLOutput;
import java.util.List;

/**
 * @author Kevin
 * @version 1.0
 * @date 2020/3/30 22:52
 */
public interface UserService {
    /**
     * @return
     */
    List<User> findAllUser();
}
