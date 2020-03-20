package categories;

import java.util.List;

public class FullHouseCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return 8;
    }
}
