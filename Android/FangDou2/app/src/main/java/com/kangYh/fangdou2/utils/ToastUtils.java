package com.kangYh.fangdou2.utils;

import android.widget.Toast;

import com.kangYh.fangdou2.MyApplication;

/**
 * Created by solo on 2018/1/10.
 * Toast工具
 */

public class ToastUtils {

    private static Toast mToast;

    private ToastUtils(){
    }

    public static void show(String str){
        if(mToast == null){
            mToast = Toast.makeText(MyApplication.getAppContext(), str, Toast.LENGTH_SHORT);
        }else {
            mToast.setText(str);
        }
        mToast.show();
    }


}
