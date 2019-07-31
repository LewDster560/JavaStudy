package com.ld.design.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        MaoTai maoTai = new MaoTai();
        WuLiangYe wuLiangYe = new WuLiangYe();
        wuLiangYe.setFlag(true);

        InvocationHandler daiLi = new GuiTai(wuLiangYe);

        Wine dynamicProxy = (Wine) Proxy.newProxyInstance(MaoTai.class.getClassLoader(), MaoTai.class.getInterfaces(), daiLi);

        dynamicProxy.sellWine();
        dynamicProxy.showPrice();
    }


}
