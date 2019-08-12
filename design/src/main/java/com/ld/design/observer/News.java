package com.ld.design.observer;

import java.util.List;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class News implements NewsListener {

    @Override
    public void addObserver(People people) {
        PEOPLE_LIST.add(people);
    }

    @Override
    public void delObserver(People people) {
        PEOPLE_LIST.remove(people);
    }

    @Override
    public void notifyObserver(People people) {

    }

    public void adviceAll() {
        for (People p : PEOPLE_LIST) {
            p.adivice(this);
        }
    }
}
