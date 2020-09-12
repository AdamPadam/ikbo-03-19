package ru.mirea.LESSON_8.LAB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Main {

    private static final String FILE_PATH = "src/ru/mirea/LESSON_8/LAB/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("--------------- 1 ---------------");
            System.out.println("Содерджание файла file1.txt:");
            readFile(FILE_PATH + "file1.txt");

            System.out.println("--------------- 2 и 3 ---------------");
            System.out.println("Введите текст для записи в файл file2.txt:");
            writeFile(FILE_PATH + "file2.txt", scanner.nextLine());

            System.out.println("--------------- 4 ---------------");
            System.out.println("Введите текст для записи в конец файла file1.txt:");
            writeEndFile(FILE_PATH + "file1.txt", scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename, String data) throws IOException {
        Path path = Paths.get(filename);
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            writer.write(data, 0, data.length());
        }
    }

    public static void writeEndFile(String filename, String data) throws IOException {
        Path path = Paths.get(filename);
        byte[] bytes = data.getBytes();
        try (OutputStream stream = Files.newOutputStream(path, CREATE, APPEND)) {
            stream.write(bytes, 0, bytes.length);
        }
    }

    public static void readFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }

}
