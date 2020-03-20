package categories;

import java.util.List;

public class FullHouseCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        int pair = RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 2);
        int threeOfAKind = RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 3);
        if (pair == 0 && threeOfAKind == 0) {
            return 0;
        }
        return pair + threeOfAKind;
    }
}
