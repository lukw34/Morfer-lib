package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Pronoun12 extends FleksemClass {

    public Pronoun12(String tag) {
        super("zaimek", "zaimek nietrzecioosobowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ACCENT
                });
    }
}