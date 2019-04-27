package uek.nlp;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;

public interface MorphologicalAnalyzer {
    String[] analyzeToArray(String text);
    String[] analyzeToArray(File fileWithText);

    String analyzeToCSV(String text);
    String analyzeToCSV(File fileWithText);

    String analyzeToJSON(String text) throws JsonProcessingException;
    String analyzeToJSON(File fileWithText) throws JsonProcessingException;
}
