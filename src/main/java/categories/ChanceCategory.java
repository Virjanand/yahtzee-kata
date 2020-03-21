package categories;

import java.util.List;

public class ChanceCategory implements Category {
    @Override
    public int scoreForRollOf5Dice(List<Integer> rolls) {
        return 0;
    }
}
