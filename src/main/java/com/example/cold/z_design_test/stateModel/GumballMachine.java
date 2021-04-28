package com.example.cold.z_design_test.stateModel;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count>0){
            state=NO_QUARTER;
        }
    }
    //投币
    public void insertQuarter(){
        if(state==HAS_QUARTER){
            System.out.println("已经有钱，不能投入");
        }else if(state==NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("成功投钱");
        }else if(state==SOLD_OUT){
            System.out.println("糖果售罄不可投钱");
        }else if (state==SOLD){
            System.out.println("成功获取糖果");
        }
    }
    //退钱
    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("成功退钱");
            state=NO_QUARTER;
        }else if(state == NO_QUARTER){
            System.out.println("未投钱");
        }else if(state == SOLD){
            System.out.println("已经转动曲柄获得糖果，不可退钱");
        }else if(state == SOLD_OUT){
            System.out.println("糖果售罄不可退款");
        }
    }
    //转动曲柄
    public void turnCrank(){
        if(state == SOLD){
            System.out.println("已经获取糖果");
        }else if(state==NO_QUARTER){
            System.out.println("为投币");
        }else if(state==HAS_QUARTER){
            System.out.println("成功转动曲柄");
            state=SOLD;
            //售出糖果
            dispense();
        }else if(state == SOLD_OUT){
            System.out.println("没有糖果");
        }
    }
    //获取糖果
    public void dispense(){
        if(state==SOLD){
            System.out.println("获得一个糖果");
            count--;
            if(count==0){
                System.out.println("糖果售罄");
                state=SOLD_OUT;
            }else{
               state=NO_QUARTER;
            }
        }else if(state==SOLD_OUT){
            System.out.println("糖果售罄");
        }else if(state==NO_QUARTER){
            System.out.println("请先投币");
        }else if(state== HAS_QUARTER){
            System.out.println("请转动曲柄");
        }
    }

    public static void main(String[] args) {
        Long[] ids= new Long[]{Long.valueOf(1), Long.valueOf(2)};
        System.out.println(ArrayUtils.contains(ids, Long.valueOf(1)));
    }

}
