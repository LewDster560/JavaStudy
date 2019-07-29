package com.ld.design.build;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public abstract class AbstractBuild {
    public Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();


    public Product getResult() {
        return product;
    }

}
