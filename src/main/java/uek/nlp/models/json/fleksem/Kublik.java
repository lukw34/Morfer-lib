package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Kublik extends FleksemClass {
    public Kublik(String tag) {
        super("kublik", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.WOKALICZNOSC
                });
    }
}