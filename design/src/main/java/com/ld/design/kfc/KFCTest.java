package com.ld.design.kfc;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public class KFCTest {
    public static void main(String[] args) {
        AbstractKFCBuilder abstractKFCBuilder = new KfCbuilder();
        KFCDirecotr kfcDirecotr = new KFCDirecotr(abstractKFCBuilder);
        Meal meal = kfcDirecotr.laile();
        System.out.println(meal.toString());
    }
}
