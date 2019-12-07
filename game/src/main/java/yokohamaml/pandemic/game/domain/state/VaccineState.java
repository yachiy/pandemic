package yokohamaml.pandemic.game.domain.state;

public enum VaccineState {
    DEVELOPING("開発中"),
    DISCOVERED("発見済み"),
    ERADICATED("根絶");

    private final String vaccineStateName;

    VaccineState(String vaccineStateName) {
        this.vaccineStateName = vaccineStateName;
    }
}
