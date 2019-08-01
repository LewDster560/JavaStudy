package com.ld.design.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author LiuDong
 * @date 2019-8-1
 */
public class CglibTest {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Hacker hacker = new Hacker();
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(programmer.getClass());
        enhancer.setCallback(hacker);
        Programmer proxy = (Programmer) enhancer.create();

        proxy.code();

    }
}
