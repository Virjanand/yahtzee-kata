package categories;

import java.util.List;

public class ThreeOfAKindCategory implements Category{
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 3 * RollCombinationUtil.occurrences(rolls, 3)
                .mapToInt(Integer::intValue)
                .max().orElse(0);
    }

    @Override
    public String toString() {
        return "ThreeOfAKind";
    }
}
