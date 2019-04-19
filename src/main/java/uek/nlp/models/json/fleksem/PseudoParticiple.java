package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class PseudoParticiple extends FleksemClass {
    public PseudoParticiple(String tag) {
        super("czasownik", "pseudoimiesłów", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT
                });
    }
}