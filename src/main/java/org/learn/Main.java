package org.learn;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Path path = Paths.get("/home/rega");
        System.out.println(path.getFileSystem());
        System.out.println(path.getFileName());
        File files = new File("/home/rega/Tutorial/Python");
        for (var file : Objects.requireNonNull(files.listFiles())) {
            if (!file.isDirectory())
                System.out.println(file);
            else if (file.getName().equals("health"))
                System.out.println(file);
        }
    }
}