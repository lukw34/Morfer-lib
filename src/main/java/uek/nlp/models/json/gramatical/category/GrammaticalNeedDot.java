package uek.nlp.models.json.gramatical.category;

public enum GrammaticalNeedDot {
    PUN("z kropką"),
    NPUN("bez kropki");
    private final String valueName;

    GrammaticalNeedDot(String valueName) {
        this.valueName = valueName;
    }

    public String getValueName() {
        return valueName;
    }
}