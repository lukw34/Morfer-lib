package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Adverb extends FleksemClass {
    public Adverb(String tag) {
        super("przysłówek", tag, new GrammaticalCategory[]{
                GrammaticalCategory.GRADE
        });
    }
}