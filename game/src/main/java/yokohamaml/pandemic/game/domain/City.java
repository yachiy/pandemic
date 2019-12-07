package yokohamaml.pandemic.game.domain;

import static yokohamaml.pandemic.game.domain.VirusType.*;

// FIXME 足りない都市宿題
public enum City {
    ATLANTA("アトランタ", 4_715_000, BLUE),
    CHICAGO("シカゴ", 9_121_000, BLUE),
    WASHINGTON("ワシントン", 4_679_000, BLUE),
    MIAMI("マイアミ", 5_582_000, YELLOW),
    KOLKATA("コルカタ", 14_374_000, BLACK),
    HONGKONG("香港", 7_106_000, RED),
    JAKARTA("ジャカルタ", 26_063_000, RED);

    private final String cityName;
    private final int population;
    private final VirusType virusType;

    City(String cityName, int population, VirusType virusType) {
        this.cityName = cityName;
        this.population = population;
        this.virusType = virusType;
    }
}
