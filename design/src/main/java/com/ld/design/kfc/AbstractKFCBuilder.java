package com.ld.design.kfc;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public abstract class AbstractKFCBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }

}
