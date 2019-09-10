package life.liang.boot.demo.model;

import lombok.Data;
import sun.rmi.runtime.Log;
@Data
public class User {
    private Integer id;
    private String token;
    private String accountId;
    private String name;
    private Long gmtCreate;
    private Long gmtModified;
    private  String avatarUrl;


}
