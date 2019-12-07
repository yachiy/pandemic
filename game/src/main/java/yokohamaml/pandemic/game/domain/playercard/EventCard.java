package yokohamaml.pandemic.game.domain.playercard;

public enum EventCard implements PlayerCard {
    SILENT_NIGHT("静かな夜"),
    AIR_TRANSPORT("空輸"),
    POPULATION_RECOVERY("人口回復"),
    PREDICATION("予測"),
    GOVERMENT_SUPPORT("政府の援助");

    private final String eventName;

    EventCard(String eventName) {
        this.eventName = eventName;
    }
}