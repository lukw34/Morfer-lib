package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Substantive extends FleksemClass {
    public Substantive(String tag) {
        super("rzeczownik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER
                });

        String[] tagParts = tag.split(":");
        if(tagParts.length > 4) {
            super.setGrammaticalCategory(GrammaticalCategory.PLURAL_TANTUM, tagParts[4]);
        }
    }
}