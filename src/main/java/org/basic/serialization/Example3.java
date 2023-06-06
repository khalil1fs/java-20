package org.basic.serialization;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("cat1");
                ObjectOutputStream out = new ObjectOutputStream(fos)
        ){
            var owner = new Owner("Khalil", new Dog());
            out.writeObject(owner);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
