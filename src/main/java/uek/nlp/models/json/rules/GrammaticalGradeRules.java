package uek.nlp.models.json.rules;

import uek.nlp.models.json.GrammaticalCategoryRule;
import uek.nlp.models.json.gramatical.category.GrammaticalGrade;

import java.util.HashMap;
import java.util.Map;

public class GrammaticalGradeRules implements GrammaticalCategoryRule {

    private static final Map<String, String> GRAMMATICAL_GRADE_VALUES_MAP;

    static {
        GRAMMATICAL_GRADE_VALUES_MAP = new HashMap<>();
        GRAMMATICAL_GRADE_VALUES_MAP.put("pos", GrammaticalGrade.POS.getValueName());
        GRAMMATICAL_GRADE_VALUES_MAP.put("com", GrammaticalGrade.COMP.getValueName());
        GRAMMATICAL_GRADE_VALUES_MAP.put("sup", GrammaticalGrade.SUP.getValueName());
    }

    @Override
    public Map<String, String> getRuleMap() {
        return GRAMMATICAL_GRADE_VALUES_MAP;
    }
}
