package com.example.bigtalk.bigtalk.chat.model.listener;

import com.example.bigtalk.bigtalk.chat.bean.User;

import cn.bmob.newim.listener.BmobListener1;
import cn.bmob.v3.exception.BmobException;

/**
 * Created by Jacqueline on 2018/2/1.
 */

public abstract class QueryUserListener extends BmobListener1<User> {
    public abstract void done(User s, BmobException e);

    @Override
    protected void postDone(User o, BmobException e) {
        done(o, e);
    }
}
