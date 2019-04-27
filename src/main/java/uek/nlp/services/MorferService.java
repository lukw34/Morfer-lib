package uek.nlp.services;


import pl.sgjp.morfeusz.ResultsIterator;
import uek.nlp.models.MorferResultIndexes;
import uek.nlp.models.json.Interpretation;
import uek.nlp.models.json.Segment;
import uek.nlp.utils.Morpheus;

import java.util.ArrayList;

public class MorferService {

    public ArrayList<Segment> getParsedResult(String sample) {
        int index = -1;
        ArrayList<Segment> morferResult = new ArrayList<>();
        ArrayList<Interpretation> actualInterpretationList = new ArrayList<>();
        ArrayList<String> lines = getMorferResult(sample);

        for (String line : lines) {
            String[] columns = line.split(" ");
            int index_A = Integer.parseInt(columns[MorferResultIndexes.INDEX_A.getIndex()]);
            String index_B = columns[MorferResultIndexes.INDEX_B.getIndex()];

            if (index_A != index) {
                index = index_A;
                morferResult.add(index_A, new Segment(columns[MorferResultIndexes.WORD.getIndex()],
                        index_A + "|" + index_B));
                actualInterpretationList = morferResult.get(index_A).getInterpretations();
            }

            String lemma = columns[MorferResultIndexes.LEMMA.getIndex()];
            String interpretation = columns[MorferResultIndexes.TAGS.getIndex()];
            actualInterpretationList.add(new Interpretation(interpretation, lemma));
        }

        return morferResult;
    }

    public ArrayList<String> getMorferResult(String sample) {
        ArrayList<String> result = new ArrayList<>();
        ResultsIterator resultsIterator = Morpheus.getResultIterator(sample);
        resultsIterator.forEachRemaining(next -> result.add(Morpheus.getInterpretations(next)));
        return result;
    }
}