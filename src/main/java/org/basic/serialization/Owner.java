package org.basic.serialization;

import java.io.Serializable;

public class Owner implements Serializable {
    private String name;

//    So this Transient mean that this field may not be Serializable, and we don't want to include it in the toString
    private transient Dog dog;


    public Owner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
