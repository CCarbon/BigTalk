package com.example.bigtalk.bigtalk.chat.model;

import android.content.Context;

import com.example.bigtalk.bigtalk.chat.tool.BmobIMApplication;

/**
 * Created by Jacqueline on 2018/2/1.
 */

public abstract class BaseModel {

    public int CODE_NULL=1000;
    public static int CODE_NOT_EQUAL=1001;

    public static final int DEFAULT_LIMIT=20;

    public Context getContext(){
        return BmobIMApplication.INSTANCE();
    }
}
