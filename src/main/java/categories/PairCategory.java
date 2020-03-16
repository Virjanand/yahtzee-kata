package categories;

import java.util.List;

public class PairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 2 * RollCombinationUtil.occurrences(rolls, 2)
                .mapToInt(Integer::intValue)
                .max().orElse(0);
    }

    @Override
    public String toString() {
        return "Pair";
    }
}
