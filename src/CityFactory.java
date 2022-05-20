import java.util.Arrays;

public class CityFactory {

    public City createCityObj(String[] split) {
        return new City(split[1], split[2], split[3], split[4], split[5]);
    }
}
