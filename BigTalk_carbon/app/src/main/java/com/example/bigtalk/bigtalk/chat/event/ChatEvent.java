package com.example.bigtalk.bigtalk.chat.event;

import cn.bmob.newim.bean.BmobIMUserInfo;

/**
 * Created by Jacqueline on 2018/2/6.
 */

public class ChatEvent {
    public BmobIMUserInfo info;

    public ChatEvent(BmobIMUserInfo info){
        this.info=info;
    }
}
