package site.rainbowx.template.dto.auth;

import lombok.Getter;

@Getter
public class LoginResponse {
    private String token;

    private long expiresIn;

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }
}
