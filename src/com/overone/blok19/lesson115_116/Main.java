package com.overone.blok19.lesson115_116;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        File dir = new File("c:\\SearcherBar");

        redFile(dir);
        Path path = Path.of("c:\\SearcherBar");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            System.out.println();
            for (Path p : files) {
                long length = p.toFile().length();
                System.out.println(p + " = " + length);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void redFile(File dir) {

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    redFile(new File(name.getPath()));
        }
        System.out.println(dir.getName() + " = " + dir.toPath().toFile().length());
    }
}


