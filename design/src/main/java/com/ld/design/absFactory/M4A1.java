package com.ld.design.absFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
@Slf4j
public class M4A1 implements Guns {
    @Override
    public void shooting() {
        log.info("M4A1....shooting");
    }
}
