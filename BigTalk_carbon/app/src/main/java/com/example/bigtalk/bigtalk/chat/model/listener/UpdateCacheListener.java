package com.example.bigtalk.bigtalk.chat.model.listener;

import cn.bmob.newim.listener.BmobListener1;
import cn.bmob.v3.exception.BmobException;

/**
 * Created by Jacqueline on 2018/2/1.
 */

public abstract class UpdateCacheListener extends BmobListener1 {
    public abstract void done(BmobException e);

    @Override
    protected void postDone(Object o, BmobException e) {
        done(e);
    }
}
