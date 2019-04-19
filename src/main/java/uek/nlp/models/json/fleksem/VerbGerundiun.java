package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbGerundiun extends FleksemClass {
    public VerbGerundiun(String tag) {
        super("czasownik", "odsłownik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.NEGATE
                });
    }
}