package uek.nlp;

import pl.sgjp.morfeusz.MorfeuszUsage;
import pl.sgjp.morfeusz.Morfeusz;
import pl.sgjp.morfeusz.ResultsIterator;
import pl.sgjp.morfeusz.app.MorfeuszUtils;

public class Morpheus {

    public static void main(String[] args) {
        System.out.println("test2");
        new Morpheus();
    }

    public Morpheus() {
        System.out.println(System.getProperty("java.library.path"));
        Morfeusz morpheusInstance = Morfeusz.createInstance(MorfeuszUsage.ANALYSE_ONLY);
        ResultsIterator resultsIterator = morpheusInstance.analyseAsIterator("Ala ma kota");
        resultsIterator.forEachRemaining(next -> {
            System.out.println(MorfeuszUtils.getInterpretationString(next, morpheusInstance));
        });
    }

    private int x;
}
