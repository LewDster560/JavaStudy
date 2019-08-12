package com.ld.design.observer;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class ObserverTest {
    public static void main(String[] args) {
        News news = new News();
        PeopleA peopleA = new PeopleA();
        PeopleB peopleB = new PeopleB();
        news.addObserver(peopleA);
        news.addObserver(peopleB);
        news.adviceAll();
    }
}
