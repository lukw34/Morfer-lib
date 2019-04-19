package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class PronounSiebie extends FleksemClass {
    public PronounSiebie(String tag) {
        super("zaimek", "zaimek SIEBIE", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.CASE
                });
    }
}