package com.ld.design.staticProxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("我现在在放哪吒");
    }
}
