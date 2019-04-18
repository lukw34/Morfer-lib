package uek.nlp;

import java.io.File;
import java.util.ArrayList;

public interface MorphologicalAnalyzer {
    String analyzeToJson(String text);
    String analyzeToJson(File fileWithText);
    String analyzeToCSV(String text);
    String analyzeToCSV(File fileWithText);
    String[] analyzeToArray(String text);
    String[] analyzeToArray(File fileWithText);
}
