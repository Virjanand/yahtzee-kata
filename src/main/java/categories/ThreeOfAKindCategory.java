package categories;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreeOfAKindCategory implements Category{
    @Override
    public int calculateScoreForNumber(List<Integer> rolls) {
        return 3 * rolls.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == 3)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .max().orElse(0);
    }
}
