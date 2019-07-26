package com.ld.design.factory;

import com.ld.design.simple.Product;
import com.ld.design.simple.Rectangle;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class RectangeFactory implements Factory {
    @Override
    public Product getProduct() {
        return new Rectangle();
    }
}
