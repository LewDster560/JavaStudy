package com.ld.design.build;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public class Director {

    private AbstractBuild build;

    public Director(AbstractBuild build) {
        this.build = build;
    }

    public Product getProduct() {
        build.buildPartA();
        build.buildPartB();
        build.buildPartC();
        return build.getResult();
    }
}
