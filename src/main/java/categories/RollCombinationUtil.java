package categories;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollCombinationUtil {

    static Stream<Integer> occurrences(List<Integer> rolls, int numberOfOccurrences) {
        return rolls.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == numberOfOccurrences)
                .map(Map.Entry::getKey);
    }
}