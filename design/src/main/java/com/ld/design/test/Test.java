package com.ld.design.test;

import com.ld.design.absFactory.*;
import com.ld.design.factory.CircleFactory;
import com.ld.design.factory.Factory;
import com.ld.design.simple.Circle;
import com.ld.design.simple.Product;
import com.ld.design.simple.Rectangle;
import com.ld.design.simple.SimpleFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        //Product product = SimpleFactory.draw("CIRCLE");
        Product product = SimpleFactory.draw("RECTANGLE");
        if (product != null) {
            product.draw();
        } else {
            System.out.println("无产品");
        }
        log.info("=============简单工厂==================");
        Product product1 = (Product) SimpleFactory.drawByReflect(Rectangle.class);
        product1.draw();
        System.out.println();
        log.info("=============工厂模式==================");
        Factory factory = new CircleFactory();
        Circle circle = (Circle) factory.getProduct();
        circle.draw();
        log.info("=============抽象工厂模式==================");
        AllFactory allFactory = new AKFactory();
        Guns akGuns = allFactory.makeGuns();
        Bullet akBullet = allFactory.makeBullet();
        akGuns.shooting();
        akBullet.load();
    }
}
