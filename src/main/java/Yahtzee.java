import categories.Category;

import java.util.List;

public class Yahtzee {

    public int score(List<Integer> rolls, Category category) {
        return category.scoreForRollOf5Dice(rolls);
    }
}
