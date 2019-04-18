package uek.nlp;

import pl.sgjp.morfeusz.ResultsIterator;
import uek.nlp.utils.Morpheus;

import java.io.File;
import java.util.ArrayList;
import java.util.Optional;

public class Morfer implements MorphologicalAnalyzer {

    public Morfer() {
        NativeLibrary.load("./inst/java/libs");
    }

    @Override
    public String analyzeToJson(String text) {
        return null;
    }

    @Override
    public String analyzeToJson(File fileWithText) {
        return null;
    }

    @Override
    public String analyzeToCSV(String text) {
        return null;
    }

    @Override
    public String analyzeToCSV(File fileWithText) {
        return null;
    }

    @Override
    public String[] analyzeToArray(String text) {
        ArrayList<String> result = new ArrayList<>();
        ResultsIterator resultsIterator = Morpheus.getResultIterator(text);
        resultsIterator.forEachRemaining(next -> result.add(Morpheus.getInterpretations(next)));
        return result.toArray(new String[0]);
    }

    @Override
    public ArrayList<String> analyzeToArray(File fileWithText) {
        return null;
    }

}
