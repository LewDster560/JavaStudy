package com.ld.design.build;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public class Build extends AbstractBuild {

    @Override
    public void buildPartA() {
        System.out.println("build====A");
    }

    @Override
    public void buildPartB() {
        System.out.println("build====B");
    }

    @Override
    public void buildPartC() {
        System.out.println("build====C");
    }
}
