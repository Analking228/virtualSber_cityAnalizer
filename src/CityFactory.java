
public class CityFactory {

    public City createCityObj(String[] split) {
        if (split.length == 6)
            return new City(split[1], split[2], split[3], split[4], split[5]);
        return new City(split[1], split[2], split[3], split[4], "");
    }
}
