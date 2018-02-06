package com.example.bigtalk.bigtalk.chat.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by Jacqueline on 2018/2/1.
 */

public class User extends BmobUser {
    private String avatar;

    public User(){}

//    public User(NewFriend friend){
//        setObjectId(friend.getUid());
//        setUsername(friend.getName());
//        setAvatar(friend.getAvatar());
//    }

    public String getAvatar() {
        return avatar;

    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;

    }
}
