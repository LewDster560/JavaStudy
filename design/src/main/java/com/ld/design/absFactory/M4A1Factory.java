package com.ld.design.absFactory;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class M4A1Factory implements AllFactory {
    @Override
    public Guns makeGuns() {
        return new M4A1();
    }

    @Override
    public Bullet makeBullet() {
        return new M4A1Bullet();
    }
}
