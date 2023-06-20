package com.driver;

public class Main {
  class A {
    public static String meth(){
        return "Invoking method from class A";
    }
  }
  class B extends A {
    public static String meth() {
        return "Method is overridden in Extended class B";
    }
  }

  public static void main(String args[]){
    B obj = new B();
     String result = obj.meth();
        System.out.println(result);
  }
}