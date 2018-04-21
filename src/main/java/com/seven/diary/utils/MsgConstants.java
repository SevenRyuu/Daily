package com.seven.diary.utils;

/**
 * created by sevenryuu77@gmail.com on 2018/4/21
 */
public class MsgConstants {

    /**
     * code 00
     * @return
     */
    public static String requestSuccess(){
        return "成功！";
    }

    /**
     * code 99
     * @return
     */
    public static String throwException(){
        return "服务器异常！";
    }

    /**
     * code 89
     * @return
     */
    public static String errorRequestParam(){
        return "请求参数错误！";
    }
}
