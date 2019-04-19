package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbWinien extends FleksemClass {
    public VerbWinien(String tag) {
        super("czasownik", "winien", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT
                });
    }
}