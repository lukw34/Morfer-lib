package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Preposition extends FleksemClass {
    public Preposition(String tag) {
        super("przyimek", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.WOKALICZNOSC
                });
    }
}