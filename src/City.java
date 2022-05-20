public class City {
    private final String  name;
    private final String  region;
    private final String  district;
    private final String  population;
    private final String  foundation;

    public City (String nm, String rgn, String dstrct, String ppltn, String fndtn){
        this.name = nm;
        this.region = rgn;
        this.district = dstrct;
        this.population = ppltn;
        this.foundation = fndtn;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population='" + population + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
