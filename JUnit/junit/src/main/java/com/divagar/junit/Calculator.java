package com.divagar.junit;

public class Calculator {
    public int addNumbers(int a,int b){
        return a+b;
    }
    public int divideNumbers(int a,int b){
        int result=0;
        try{
            result=a/b; 
        }catch(Exception e){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return result;
    }
}
