package categories;

import java.util.List;

public class FourOfAKindCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 4);
    }
}
