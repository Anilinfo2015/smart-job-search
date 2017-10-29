package com.learn.webservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {
        Map<Person, Company> map = new HashMap<>();


        map.put(new Person("anil", 11, "sfsf"), new Company("barclyas", "fsfs", 3232, null));
        map.put(new Person("anil", 11, "sfsf"), new Company("barclyas", "fsfs", 3232, null));
        map.put(new Person("anil", 11, "sfsf"), new Company("barclyas", "fsfs", 3232, null));
        map.put(new Person("anil", 11, "sfsf"), new Company("barclyas", "fsfs", 3232, null));


        for (Map.Entry<Person, Company> fsf : map.entrySet()) {
            System.out.println(fsf.getKey() + ",,,,," + fsf.getValue());
        }

        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);
        mylist.add(1);


    }
}


class Company {
    private String name;
    private String address;
    private int noOfEmployee;
    //container
    private List<Employee> employees;

    public Company(String name, String address, int noOfEmployee, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.noOfEmployee = noOfEmployee;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noOfEmployee=" + noOfEmployee +
                ", employees=" + employees +
                '}';
    }
}

//inheritance
class Employee extends Person {
    private double salary;

    public Employee(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


//POJO
class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        Person pp = (Person) obj;
        return pp.age == this.age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
