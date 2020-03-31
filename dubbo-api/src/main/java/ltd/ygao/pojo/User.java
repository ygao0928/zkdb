package ltd.ygao.pojo;

import lombok.Data;


import java.io.Serializable;

/**
 * @author Kevin
 * @version 1.0
 * @date 2020/3/30 22:49
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String passWord;
}
