import categories.NumberCategory;

import java.util.List;

public class Yahtzee {

    public int score(List<Integer> rolls, NumberCategory category) {
        return category.calculateScoreForNumber(rolls);
    }
}
