package com.ld.design.decorator;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class ManDecoratorB extends Decorator {
    @Override
    public void eat() {
        super.eat();
        System.out.println("ManDecoratorB");
    }
}
