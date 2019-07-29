package com.ld.design.kfc;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public class KfCbuilder extends AbstractKFCBuilder {

    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
