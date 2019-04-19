package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Pronoun3 extends FleksemClass {
    public Pronoun3(String tag) {
        super("zaimek", "zaimek trzecioosobowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ACCENT,
                        GrammaticalCategory.POST_PREPOSITIONALITY
                });
    }
}