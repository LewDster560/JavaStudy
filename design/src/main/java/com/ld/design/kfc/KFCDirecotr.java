package com.ld.design.kfc;

/**
 * @author LiuDong
 * @date 2019-7-29
 */
public class KFCDirecotr {

    private AbstractKFCBuilder kfCbuilder;

    public KFCDirecotr(AbstractKFCBuilder kfCbuilder) {
        this.kfCbuilder = kfCbuilder;
    }

    public Meal laile() {
        kfCbuilder.buildDrink();
        kfCbuilder.buildFood();
        return kfCbuilder.getMeal();
    }

}
