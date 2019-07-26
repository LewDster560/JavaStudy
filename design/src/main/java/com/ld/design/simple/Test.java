package com.ld.design.simple;

import com.ld.design.factory.CircleFactory;
import com.ld.design.factory.Factory;
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

    }
}
