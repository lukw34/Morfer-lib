package uek.nlp.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileService {

    public String readFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        try {
            new Scanner(new FileInputStream(file), "UTF-8").forEachRemaining(val -> {
                stringBuilder.append(val);
                stringBuilder.append(" ");
            });
            result = stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
