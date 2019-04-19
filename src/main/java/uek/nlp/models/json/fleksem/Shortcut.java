package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class Shortcut extends FleksemClass {
    public Shortcut(String tag) {
        super("skrót", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.NEED_DOT
                });
    }
}