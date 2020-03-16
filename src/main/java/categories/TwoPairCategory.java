package categories;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TwoPairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        List<Integer> occurences = RollCombinationUtil.occurrences(rolls, 2).collect(toList());
        if (occurences.size() == 2)
        return 2 * occurences.stream().mapToInt(Integer::intValue)
                .sum();
        return 0;
    }

    @Override
    public String toString() {
        return "TwoPair";
    }
}
