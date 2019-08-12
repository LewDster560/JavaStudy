package com.ld.design.decorator;

/**
 * @author LiuDong
 * @date 2019-8-12
 */
public abstract class Decorator implements Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }

}
