package uek.nlp.models.json;

import uek.nlp.models.json.rules.FleksemRules;

public class Interpretation {
    private String lemma;
    private String tag;

    private Fleksem fleksemClass;

    public Interpretation(String tag, String lemma) {
        this.tag = tag;
        this.lemma = lemma;
        this.fleksemClass = FleksemRules.getFleksemClass(tag);
    }

    public String getLemma() {
        return this.lemma;
    }

    public String getTag() {
        return this.tag;
    }

    public String getFleksem() {
        return this.fleksemClass.getFleksem();
    }

    public String getWordClass() {
        return this.fleksemClass.getWordClass();
    }

    public GrammaticalCategories getGrammaticalCategories() {
        return  this.fleksemClass.getGrammaticalCategories();
    }
}
