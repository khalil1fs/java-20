package org.basic.serialization;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        try (
                var fis = new FileInputStream("cat1");
                var in = new ObjectInputStream(fis)
        ){
            Cat c = (Cat) in.readObject();
            System.out.println(c);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
