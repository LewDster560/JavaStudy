package com.ld.design.observer;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class PeopleB implements People {
    @Override
    public void adivice(News news) {
        System.out.println(news);
        System.out.println("无聊");
    }
}
