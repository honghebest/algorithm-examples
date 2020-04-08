package com.hongghe.algorithmexamples.leetcode;

/**
 * @author: hongghe @date: 2019-03-24 16:45
 */
public class NumExponent {

    boolean invalidInput=false;
    public double Power(double base, int exponent) {
        //如果底数等于0并且指数小于0
        //由于base为double型，不能直接用==判断
        if(equal(base,0.0)&&exponent<0){
            invalidInput=true;
            return 0.0;
        }
        int absexponent=exponent;
        //如果指数小于0，将指数转正
        if(exponent<0)
            absexponent=-exponent;
        //getPower方法求出base的exponent次方。
        double res=getPower(base,absexponent);
        //如果指数小于0，所得结果为上面求的结果的倒数
        if(exponent<0)
            res=1.0/res;
        return res;
    }
    //比较两个double型变量是否相等的方法
    boolean equal(double num1,double num2){
        if(num1-num2>-0.000001&&num1-num2<0.000001)
            return true;
        else
            return false;
    }
    //求出b的e次方的方法
    double getPower(double b,int e){
        //如果指数为0，返回1
        if(e==0)
            return 1.0;
        //如果指数为1，返回b
        if(e==1)
            return b;
        //e>>1相等于e/2，这里就是求a^n =（a^n/2）*（a^n/2）
        double result=getPower(b,e>>1);
        result*=result;
        //如果指数n为奇数，则要再乘一次底数base
        if((e&1)==1)
            result*=b;
        return result;
    }
}
