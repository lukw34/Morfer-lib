package uek.nlp;

import java.io.File;
import java.util.ArrayList;

public interface MorphologicalAnalyzer {
    String[] analyzeToArray(String text);
    String[] analyzeToArray(File fileWithText);

    String analyzeToCSV(String text);
    String analyzeToCSV(File fileWithText);
}
