package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class AdjectivalParticiple extends FleksemClass {

    public AdjectivalParticiple(String tag) {
        super("czasownik", "imiesłów przymiotnikowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.NEGATE
                });
    }
}