package life.liang.boot.demo.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String name;
    private Long id;
    private  String bio;
    private  String avatarUrl;


}
