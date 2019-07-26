package com.ld.design.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
@Slf4j
public class Rectangle implements Product {
    @Override
    public void draw() {
        log.info("I am Rectangle");
    }
}
