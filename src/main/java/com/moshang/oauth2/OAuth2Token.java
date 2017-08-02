package com.moshang.oauth2;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author moshang
 * @date 2017年08月02日
 */
public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
