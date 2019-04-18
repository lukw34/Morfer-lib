package uek.nlp.services;

import pl.sgjp.morfeusz.ResultsIterator;
import uek.nlp.utils.Morpheus;

import java.util.ArrayList;

public class ResultService {

   public String[] toArray(String data) {
        ArrayList<String> result = new ArrayList<>();
        ResultsIterator resultsIterator = Morpheus.getResultIterator(data);
        resultsIterator.forEachRemaining(next -> result.add(Morpheus.getInterpretations(next)));
        return result.toArray(new String[0]);
   }
}
