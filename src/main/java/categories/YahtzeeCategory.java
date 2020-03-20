package categories;

import java.util.List;

public class YahtzeeCategory implements Category{
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return 50;
    }
}
