package categories;

import java.util.List;

public class YahtzeeCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 5) != 0 ? 50 : 0;
    }
}
