package com.smart.job.search.core;

import java.util.HashMap;
import java.util.Map;

public class JavaHashCodeEquals {

    public static void main(String[] args) {

        MyClass mm=new MyClass();

        System.out.println(mm);

        Map<MyClass,String>map=new HashMap<MyClass, String>();



    }

    //user define
    static class MyClass extends Object{

        String name;
        String city;
        int aage;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAage() {
            return aage;
        }

        public void setAage(int aage) {
            this.aage = aage;
        }

        @Override
        public boolean equals(Object obj) {

            MyClass ooo= (MyClass) obj;
            return this.name.equals(ooo.name)&&this.city.equals(ooo.city)&&this.aage==ooo.aage;
        }

        @Override
        public int hashCode() {
            return 1234;
        }
    }
}



