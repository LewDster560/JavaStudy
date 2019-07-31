package com.ld.design.dynamicProxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
@Slf4j
public class GuiTai implements InvocationHandler {

    public String daiLiName = "代理人刘冬";

    private Object pinpai;

    public GuiTai(Object pinpai) {
        this.pinpai = pinpai;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println();
        log.info("================================代理begin");
        System.out.println("柜台是:" + this.getClass().getField("daiLiName").get(this));
        System.out.println("品牌是:" + this.pinpai.getClass().getField("name").get(pinpai));
        method.invoke(pinpai, args);
        log.info("================================代理over");
        return null;
    }
}
