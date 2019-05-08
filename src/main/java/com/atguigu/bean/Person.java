package com.atguigu.bean;

/**
 * @author shkstart
 * @create 2019-04-21 20:23
 */
public class Person {

    private String name;

    private int age;

    private Man man;

    public Person() {
    }

    public Person(String name, int age, Man man) {
        this.name = name;
        this.age = age;
        this.man = man;
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

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
