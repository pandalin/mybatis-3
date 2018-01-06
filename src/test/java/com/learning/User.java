package com.learning;

/**
 * @author xm.lin xm.lin@anxincloud.com
 * @Description
 * @date 2018/1/5 16:34
 */
public class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "username:" + this.username;
    }
}
