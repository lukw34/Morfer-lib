package uek.nlp.models.json.gramatical.category;

public enum GrammaticalNegate {
    AFF("niezanegowana"),
    NEG("zanegowana");
    private final String valueName;

    GrammaticalNegate(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}