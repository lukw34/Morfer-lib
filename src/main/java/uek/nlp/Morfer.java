package uek.nlp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import uek.nlp.services.CSVMorferService;
import uek.nlp.services.FileService;
import uek.nlp.services.MorferService;
import uek.nlp.utils.NativeLibrary;

import java.io.File;

public class Morfer implements MorphologicalAnalyzer {
    FileService fileService;
    MorferService morferService;
    CSVMorferService csvMorferService;
    ObjectMapper mapper;

    public Morfer() {
        NativeLibrary.load("./inst/java/libs");
        fileService = new FileService();
        morferService = new MorferService();
        csvMorferService = new CSVMorferService();
        mapper = new ObjectMapper();
    }

    public static void main(String[] args) {
        Morfer instance = new Morfer();
        System.out.println(instance.analyzeToCSV("Ala ma kota"));
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

    @Override
    public String analyzeToJSON(String text) throws JsonProcessingException {
        return mapper.writeValueAsString(morferService.getParsedResult(text));
    }

    @Override
    public String analyzeToJSON(File fileWithText) throws JsonProcessingException {
        return this.analyzeToJSON(fileService.readFile(fileWithText));
    }


}
