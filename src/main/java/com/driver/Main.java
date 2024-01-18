package com.driver;

public class Main {
    // Class A with method 'meth'
    static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    // Class B extending Class A
    static class B extends A {
        // Override method 'meth' in Class B
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String args[]){
        // Creating an object of class B
        B obj = new B();

        // Calling the overridden method using object of class B
        String result = obj.meth();
        System.out.println(result);
    }
}
