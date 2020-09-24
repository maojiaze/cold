package com.example.cold.z_design_test.singleton;

/**
 * 单例模式
 */
public class One {
    private static One one;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private One(){
        System.out.println("初始化One");
    }
    public static One getInstance(){
        if(one==null){
            one=new One();
        }
        return one;
    }
}
