package categories;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RollCombinationUtil {
    static IntStream occurencesOfPairs(List<Integer> rolls) {
        return rolls.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .mapToInt(Map.Entry::getKey);
    }
}