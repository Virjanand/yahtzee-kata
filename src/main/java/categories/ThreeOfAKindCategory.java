package categories;

import java.util.List;

public class ThreeOfAKindCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 3);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
