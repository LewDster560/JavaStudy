package com.ld.design.staticProxy;

/**
 * @author LiuDong
 * @date 2019-7-31
 */
public class MovieTest {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        Cinema cinema = new Cinema(realMovie);
        cinema.play();
    }
}
