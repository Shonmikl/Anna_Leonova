package org.example._2023_10_14.tasks;

import java.io.*;

public class FileReplaceExample {
    public static void main(String[] args) {
        String filePath = "E://Anna_Leonova//src//main//java//org//example//_2023_10_14//tasks//1.txt";
        String content = readFile(filePath);

        content = content.replaceAll("Текст задания: ", "");
        writeFile(filePath, content);
    }

    private static String readFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static void writeFile(String filePath, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
