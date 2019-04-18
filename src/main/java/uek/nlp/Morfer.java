package uek.nlp;

import uek.nlp.services.FileService;
import uek.nlp.services.ResultService;
import uek.nlp.utils.NativeLibrary;

import java.io.File;

public class Morfer implements MorphologicalAnalyzer {
    FileService fileService;
    ResultService resultService;

    public Morfer() {
        NativeLibrary.load("./inst/java/libs");
        fileService = new FileService();
        resultService = new ResultService();
    }

    @Override
    public String[] analyzeToArray(String text) {
      return this.resultService.toArray(text);
    }

    @Override
    public String[] analyzeToArray(File fileWithText) {
        return this.analyzeToArray(fileService.readFile(fileWithText));
    }

}
