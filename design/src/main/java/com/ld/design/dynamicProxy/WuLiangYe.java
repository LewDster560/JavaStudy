package com.ld.design.dynamicProxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class WuLiangYe implements Wine {

    public String name = "五粮液";

    private boolean flag;

    @Override
    public void sellWine() {
        if (flag) {
            System.out.println("我卖五粮液");
        } else {
            System.out.println("我卖假的五粮液");
        }
    }

    @Override
    public void showPrice() {
        System.out.println("价格大概是500");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
