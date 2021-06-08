package com.example.cold.Head_First_Design.v4_factory;

/**
 * 工厂模式
 * OO原则：封装变化 多用组合少用继承  针对接口编程不针对实现编程  为交互对象之间的松耦合设计而努力  对扩展开放对修改关闭   依赖抽象不要依赖具体类
 * 工厂方法模式 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类实例化推迟到子类
 * 抽象工厂模式 提供一个接口，用户创建相关或依赖对象的家族，而不需要明确指定具体类
 * 工厂方法和抽象方法都负责创建对象，工厂方法用的是继承，抽象方法用的是组合
 */
public class Cs {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore=new NYStylePizzaStore();
        System.out.println(nyStylePizzaStore.orderPizza("clam").getName());
    }
}
