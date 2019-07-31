package com.ld.design.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class GuiTai implements InvocationHandler {

    private Object pinpai;

    public GuiTai(Object pinpai) {
        this.pinpai = pinpai;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("================================代理begin");
        System.out.println("柜台是" + this.getClass().getSimpleName());
        System.out.println("品牌是" +  this.pinpai.getClass().getField("name").get(pinpai));
        method.invoke(pinpai, args);
        System.out.println("================================代理over");
        return null;
    }
}
