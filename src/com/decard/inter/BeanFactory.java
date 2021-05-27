package com.decard.inter;

public class BeanFactory {

    public static <T> T getInstance(Class<T> clazz) {
        T t = null;
        //反射创建对象
        try {
            String name = clazz.getName();
            System.out.println("类名称   "+name);
            Class cla = Class.forName(name);
            //创建该类的对象,返回Object
            t = (T) cla.newInstance();
        }catch (Exception ex){ex.printStackTrace();}
        return t;
    }
}
