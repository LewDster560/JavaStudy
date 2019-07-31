package com.ld.design.dynamicProxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class MaoTai implements Wine {

    public String name = "茅台";

    @Override
    public void sellWine() {
        System.out.println("我卖茅台");
    }

    @Override
    public void showPrice() {
        System.out.println("价格大概是1000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
