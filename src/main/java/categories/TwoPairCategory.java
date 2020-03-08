package categories;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class TwoPairCategory implements Category {
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        Map<Integer, Long> occurences = rolls.stream()
                .collect(groupingBy(Integer::intValue, counting()));
        return 2 * occurences.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}
