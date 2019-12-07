package yokohamaml.pandemic.game.domain.state;

import yokohamaml.pandemic.game.domain.VirusType;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static yokohamaml.pandemic.game.domain.state.VaccineState.*;

public class VirusMarkers {
    private Map<VirusType, VaccineState> markers;
    public static final VirusMarkers INITIAL = new VirusMarkers(Arrays.stream(VirusType.values())
            .collect(Collectors.toMap(Function.identity(), v -> DEVELOPING)));

    private VirusMarkers(Map<VirusType, VaccineState> markers) {
        this.markers = Collections.unmodifiableMap(new EnumMap<>(markers));
    }

    public VirusMarkers discoveryVaccin(VirusType virusType) {
        assert markers.get(virusType) == DEVELOPING;
        Map<VirusType, VaccineState> markers = new EnumMap<>(this.markers);
        markers.put(virusType, DISCOVERED);
        return new VirusMarkers(markers);
    }

    public VirusMarkers eradicate(VirusType virusType) {
        assert markers.get(virusType) == DISCOVERED;
        Map<VirusType, VaccineState> markers = new EnumMap<>(this.markers);
        markers.put(virusType, ERADICATED);
        return new VirusMarkers(markers);
    }
}
