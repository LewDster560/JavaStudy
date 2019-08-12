package com.ld.design.decorator;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public class DecoratorTest {
    public static void main(String[] args) {

        Man man = new Man();

        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();

        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(man);
        manDecoratorA.eat();
        System.out.println("========================");
        manDecoratorB.eat();

    }
}
