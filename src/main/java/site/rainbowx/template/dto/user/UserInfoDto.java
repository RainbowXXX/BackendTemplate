package site.rainbowx.template.dto.user;

import org.springframework.beans.BeanUtils;
import site.rainbowx.template.entity.User;

import java.util.List;

public class UserInfoDto {
    public String id;
    public String name;
    // public String avatar;    // TODO add avatar
    public List<String> role;
    public String status;       // "active" | "inactive"
    public String joinDate;

    public static UserInfoDto fromUser(User user) {
        UserInfoDto dto = new UserInfoDto();
        BeanUtils.copyProperties(user, dto);
        return dto;
    }
}
