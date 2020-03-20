package categories;

import java.util.List;

import static java.util.Arrays.asList;

public class LargeStraightCategory implements Category {
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        List<Integer> smallStraight = asList(2, 3, 4, 5, 6);
        return smallStraight.equals(rolls) ? 20 : 0;
    }
}
