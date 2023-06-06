package org.basic.serialization;

import java.io.Serializable;

public class Cat implements Serializable {

    private String name;
    private transient int age;  // Transient

    public Cat(String tom, int age) {
        this.name = tom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
