package categories;

import java.util.List;

public class PairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 2 * RollCombinationUtil.occurencesOfPairs(rolls)
                .max().orElse(0);
    }

    @Override
    public String toString() {
        return "Pair";
    }
}
