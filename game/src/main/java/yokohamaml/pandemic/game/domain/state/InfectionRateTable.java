package yokohamaml.pandemic.game.domain.state;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 感染率表を表す値オブジェクト
 */
public class InfectionRateTable {
    private static final List<Integer> rates = Collections.unmodifiableList(Arrays.asList(2, 2, 2, 3, 3, 4, 4));
    private static final int MAX_COUNT = rates.size() - 1;
    private final int epidemicCount;
    private final int rate;

    public static final InfectionRateTable INITIAL = new InfectionRateTable(0);

    private InfectionRateTable(int epidemicCount) {
        this.epidemicCount = epidemicCount;
        this.rate = rates.get(Math.min(epidemicCount, MAX_COUNT));
    }

    public int getRate() {
        return rate;
    }

    public InfectionRateTable countUp() {
        return new InfectionRateTable(epidemicCount + 1);
    }
}