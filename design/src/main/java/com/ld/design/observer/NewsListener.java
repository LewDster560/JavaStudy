package com.ld.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public interface NewsListener {

    List<People> PEOPLE_LIST = new ArrayList<>();

    void addObserver(People people);

    void delObserver(People people);

    void notifyObserver(People people);

}
