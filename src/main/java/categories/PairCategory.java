package categories;

import java.util.List;

public class PairCategory implements Category {
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return RollCombinationUtil.scoreForNumberOfOccurrences(rolls, 2);
    }

    @Override
    public String toString() {
        return "Pair";
    }
}
