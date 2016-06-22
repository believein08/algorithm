package com.itfish.Q2;

/**
 * Created by Test on 2016/6/22.
 */
public class Singleton {
    private static Singleton instance=null;
    private Singleton(){}
    public static Singleton getinstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
