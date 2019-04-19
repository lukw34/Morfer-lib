package uek.nlp.models.json.gramatical.category;

public enum GrammaticalAccommodative {
    CONGR("uwzględniająca"),
    REC("rządzaca");
    private final String valueName;

    GrammaticalAccommodative(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}