package com.ld.design.simple;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class Test {
    public static void main(String[] args) {
        //Product product = SimpleFactory.draw("CIRCLE");
        Product product = SimpleFactory.draw("RECTANGLE");
        if (product != null) {
            product.draw();
        } else {
            System.out.println("无产品");
        }
        System.out.println("===============================");
        Product product1 = (Product) SimpleFactory.drawByReflect(Rectangle.class);
        product1.draw();
    }
}
