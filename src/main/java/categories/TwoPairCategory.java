package categories;

import java.util.List;

public class TwoPairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 2 * RollCombinationUtil.occurencesOfPairs(rolls)
                .sum();
    }

    @Override
    public String toString() {
        return "TwoPair";
    }
}
