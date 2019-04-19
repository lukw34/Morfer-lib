package uek.nlp.models.json.fleksem;

import uek.nlp.models.json.FleksemClass;
import uek.nlp.models.json.GrammaticalCategory;

public class AdverbParticiple extends FleksemClass {
    public AdverbParticiple(String tag) {
        super("czasownik", "imiesłów przysłówkowy", tag,
                new GrammaticalCategory[]{
                        GrammaticalCategory.ASPECT
                });
    }
}