package uek.nlp.services;

import uek.nlp.models.CSVMorferResult;

import java.util.ArrayList;

public class CSVMorferService {

    public String getCSVData(ArrayList<String> morferResult) {
        StringBuilder CSVBuilder = new StringBuilder();
        morferResult.stream()
                .map(val -> new CSVMorferResult(val.split(" "), ";"))
                .forEach(csvRow -> {
                    CSVBuilder.append(csvRow.toString());
                    CSVBuilder.append("\n");
                });
        return CSVBuilder.toString();
    }


}
