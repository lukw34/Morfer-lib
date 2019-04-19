package uek.nlp;

import uek.nlp.services.CSVMorferService;
import uek.nlp.services.FileService;
import uek.nlp.services.MorferService;
import uek.nlp.utils.NativeLibrary;

import java.io.File;

public class Morfer implements MorphologicalAnalyzer {
    FileService fileService;
    MorferService morferService;
    CSVMorferService csvMorferService;

    public Morfer() {
        NativeLibrary.load("./inst/java/libs");
        fileService = new FileService();
        morferService = new MorferService();
        csvMorferService = new CSVMorferService();
    }

    @Override
    public String[] analyzeToArray(String text) {
      return this.morferService.getMorferResult(text).toArray(new String[0]);
    }

    @Override
    public String[] analyzeToArray(File fileWithText) {
        return this.analyzeToArray(fileService.readFile(fileWithText));
    }

    @Override
    public String analyzeToCSV(String text) {
        return this.csvMorferService.getCSVData(this.morferService.getMorferResult(text));
    }

    @Override
    public String analyzeToCSV(File fileWithText) {
        return this.analyzeToCSV(fileService.readFile(fileWithText));
    }

}
