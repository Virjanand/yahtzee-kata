package categories;

import java.util.List;

import static java.util.Arrays.asList;

public class SmallStraightCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        List<Integer> smallStraight = asList(1, 2, 3, 4, 5);
        return smallStraight.equals(rolls) ? 15 : 0;
    }
}
