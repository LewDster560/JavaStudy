package com.ld.design.simple;

/**
 * @author LiuDong
 * @date 2019-7-26
 */
public class SimpleFactory {
    /**
     * 简单工厂
     *
     * @param shapeType
     * @return
     */
    public static Product draw(String shapeType) {

        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else {
            return null;
        }
    }

    /**
     * 简单工厂反射
     *
     * @param clzz
     * @return
     */
    public static Object drawByReflect(Class<? extends Product> clzz) {
        Object object = null;
        try {
            object = Class.forName(clzz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
