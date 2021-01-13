package com.my.jenkins.demo;

/**
 * mmw
 * 2021/1/13
 */

public class MyTest {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
