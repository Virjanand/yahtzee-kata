import categories.Category;
import categories.NumberCategory;

import java.util.List;

public class Yahtzee {

    public int score(List<Integer> rolls, Category category) {
        return category.calculateScoreForNumber(rolls);
    }
}
