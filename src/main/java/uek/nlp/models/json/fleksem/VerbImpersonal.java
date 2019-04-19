package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbImpersonal extends FleksemClass {
    public VerbImpersonal(String tag) {
        super("czasownik", "bezoosobnik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.ASPECT
                });
    }
}