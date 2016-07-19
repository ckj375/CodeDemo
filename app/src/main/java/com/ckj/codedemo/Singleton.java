package com.ckj.codedemo;

/**
 * 单例模式
 * Created by chenkaijian on 16-7-19.
 */
public class Singleton {
    private static Singleton instance = null;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
    }
}
