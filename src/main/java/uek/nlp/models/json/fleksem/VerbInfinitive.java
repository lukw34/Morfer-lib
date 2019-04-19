package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class VerbInfinitive extends FleksemClass {
    public VerbInfinitive(String tag) {
        super("czasownik", "bezokolicznik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.ASPECT
                });
    }
}