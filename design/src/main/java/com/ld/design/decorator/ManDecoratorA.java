package com.ld.design.decorator;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecorator类");
    }

    private void reEat() {
        System.out.println("再吃一点点");
    }

}
