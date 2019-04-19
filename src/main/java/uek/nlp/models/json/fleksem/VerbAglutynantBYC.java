package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbAglutynantBYC extends FleksemClass {
    public VerbAglutynantBYC(String tag) {
        super("czaswonik", "aglutynant BYĆ", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.PERSON,
                        GrammaticalCategory.ASPECT,
                        GrammaticalCategory.WOKALICZNOSC,
                });
    }
}