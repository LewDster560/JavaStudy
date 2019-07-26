package com.ld.design.factory;

import com.ld.design.simple.Circle;
import com.ld.design.simple.Product;

import java.io.File;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class CircleFactory implements Factory {
    @Override
    public Product getProduct() {
        return new Circle();
    }
}
