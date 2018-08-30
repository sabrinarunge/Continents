package models;

public class Continent
{
    private String name;
    private int squareKilometers;
    private long population;
    private String image;

    public Continent(String name, int squareKilometers, long population, String image)
    {
        this.name = name;
        this.squareKilometers = squareKilometers;
        this.population = population;
        this.image = image;
    }

    public String getName()
    {
        return name;
    }

    public int getSquareKilometers()
    {
        return squareKilometers;
    }

    public long getPopulation()
    {
        return population;
    }

    public String getImage()
    {
        return image;
    }
}
