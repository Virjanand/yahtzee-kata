import categories.NumberCategory;

import java.util.List;

public class Yahtzee {
    private final NumberCategory numberCategory = new NumberCategory();

    public int score(List<Integer> rolls, String category) {
        if (category.equals("Twos")) {
            return numberCategory.calculateScoreForNumber(rolls, 2);
        }
        return numberCategory.calculateScoreForNumber(rolls, 1);
    }
}
