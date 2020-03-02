import categories.NumberCategory;

import java.util.List;

public class Yahtzee {
    private NumberCategory numberCategory;

    public int score(List<Integer> rolls, String category) {
        if (category.equals("Twos")) {
            numberCategory = new NumberCategory(2);
            return numberCategory.calculateScoreForNumber(rolls);
        }
        numberCategory = new NumberCategory(1);
        return numberCategory.calculateScoreForNumber(rolls);
    }
}
