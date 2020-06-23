package com.code.pojo;

/**
 * @Author weitangzhao
 **/
public class Student {
    private String name;

    private int age;

    private int gender;

    private int idNo;

    public Student() {
    }

    public Student(String name, int age, int gender, int idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", idNo=" + idNo +
                '}';
    }
}
