package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbPastBYC extends FleksemClass {
    public VerbPastBYC(String tag) {
        super("czasownik", "forma przyszła BYĆ", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT
                });
    }
}