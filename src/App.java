import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("src/city_ru.csv"))) {
            scanner.useDelimiter("\r\n");
            ArrayList<City> cityArray = new ArrayList<>();
            CityFactory cityFactory = new CityFactory();
            while (scanner.hasNext()) {
                cityArray.add(cityFactory.createCityObj(scanner.next().split(";")));
            }
            for (City c : cityArray) {
                System.out.println(c);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
