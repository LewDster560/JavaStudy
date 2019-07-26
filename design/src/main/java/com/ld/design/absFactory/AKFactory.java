package com.ld.design.absFactory;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class AKFactory implements AllFactory {
    @Override
    public Guns makeGuns() {
        return new AK();
    }

    @Override
    public Bullet makeBullet() {
        return new AK_Bullet();
    }
}
