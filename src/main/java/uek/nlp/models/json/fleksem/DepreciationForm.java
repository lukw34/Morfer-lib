package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class DepreciationForm extends FleksemClass {
    public DepreciationForm(String tag) {
        super("rzeczownik", "forma deprecjatywna", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NUMBER,
                        GrammaticalCategory.CASE,
                        GrammaticalCategory.GENDER
                });
    }
}
