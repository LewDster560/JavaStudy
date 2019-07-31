package com.ld.design.staticProxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class Cinema implements Movie {

    private RealMovie movie;

    public Cinema(RealMovie movie) {
        super();
        this.movie = movie;
    }

    @Override
    public void play() {
        begin();
        movie.play();
        end();
    }

    private void end() {
        System.out.println("电影结束");
    }

    private void begin() {
        System.out.println("电影开始");
    }
}
