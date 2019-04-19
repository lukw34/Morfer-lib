package uek.nlp.models.json.gramatical.category;

public enum GrammaticalAccent {
    AKC("akcentowana"),
    NAKC("nieakcentowana");
    private final String valueName;

    GrammaticalAccent(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}