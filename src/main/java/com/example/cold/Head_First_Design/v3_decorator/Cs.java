package com.example.cold.Head_First_Design.v3_decorator;


/**
 * 装饰者模式
 * OO原则：封装变化 多用组合少用继承  针对接口编程不针对实现编程  为交互对象之间的松耦合设计而努力  对扩展开放对修改关闭
 * OO模式 装饰者模式：动态的将责任附加的对象上。想要扩展功能，装饰者提供有别于继承的另一种选择
 */
public class Cs {
    public static void main(String[] args) {

        Beverage espresso=new Espresso();
        espresso=new Mocha(espresso);
        espresso=new Milk(espresso);

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

    }
}
