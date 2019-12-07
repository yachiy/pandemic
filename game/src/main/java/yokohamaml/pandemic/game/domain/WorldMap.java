package yokohamaml.pandemic.game.domain;

import java.util.*;

import static yokohamaml.pandemic.game.domain.City.*;

public class WorldMap {
    private final Map<City, List<City>> network;

    {
        Map<City, List<City>> network = new HashMap<>();
        // FIXME 初期化の方法考える
        network.put(ATLANTA, Collections.unmodifiableList(Arrays.asList(CHICAGO, MIAMI, WASHINGTON)));
        this.network = Collections.unmodifiableMap(network);
    }
}
