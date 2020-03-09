package categories;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 2 * occurencesOfPairs(rolls)
                .max().orElse(0);
    }

    private IntStream occurencesOfPairs(List<Integer> rolls) {
        return rolls.stream()
                .collect(groupingBy(Integer::intValue, counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .mapToInt(Map.Entry::getKey);
    }
}
