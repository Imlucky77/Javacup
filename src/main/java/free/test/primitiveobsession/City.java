package free.test.primitiveobsession;

public class City {
    private final String name;
    private final int population;
    private final Continent continent;

    public City(String name, int population, Continent continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return String.format("%s has a popluation of %s and is located in %s", name, population, continent);
    }

    public static final City[] ALL_CITIES = {
            new City("London", 13000000, Continent.EUROPE),
            new City("Barcelona", 13000000, Continent.EUROPE),
            new City("Sydney", 4119190, Continent.AUSTRALIA),
            new City("Stockholm", 1932763, Continent.EUROPE),
            new City("New York", 21903623, Continent.AMERICA),
            new City("Tokyo", 12570000, Continent.ASIA)

    };

}
