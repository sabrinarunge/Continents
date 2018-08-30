package models;

import java.util.Map;
import java.util.TreeMap;

public class Continents
{
    private Map<String, Continent> continents;

    public Continents()
    {
       continents = new TreeMap<>();
       Continent continent = new Continent("Africa", 30370000, 1292496967, "africa.jpg");
       continents.put("Africa", continent);

       continent = new Continent("Asia", 44579000, 4551389954L, "asia.jpg");
       continents.put("Asia", continent);

       continent = new Continent("Antarctica", 14000000, 1000, "antarctica.jpg");
       continents.put("Antarctica", continent);

       continent = new Continent("Australia", 7617930, 24819189, "australia.jpg");
       continents.put("Australia", continent);

       continent = new Continent("Europe", 10180000, 742735844, "europe.jpg");
       continents.put("Europe", continent);

       continent = new Continent("North America", 24709000, 364252401, "northamerica.jpg");
       continents.put("North America", continent);

       continent = new Continent("South America", 17840000, 428842266, "southamerica.jpg");
       continents.put("South America", continent);
    }

    public Map<String, Continent> getContinents()
    {
        return continents;
    }
}
