package howtoprogram.Chapter04.exercises.exercise_39;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.39
 */
public class WorldPopulationGrowth {
    private int sample;
    private long[][] populationProj;
    private long population;
    private long basePopulation;
    private double growthRate;

    public WorldPopulationGrowth(long basePopulation, double growthRate, int sample) {
        setBasePopulation(basePopulation);
        setGrowthRate(growthRate);
        setSample(sample);
    }

    public void setBasePopulation(long basePopulation) {
        this.basePopulation = basePopulation;
        population = basePopulation;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setSample(int sample) {
        this.sample = sample;
        populationProj = new long[sample][sample];
    }

    public int getSample() {
        return sample;
    }

    public long[][] getPopulationProjection() {
        return projectPopulation();
    }

    // populate the projection array with projected population data
    private long[][] projectPopulation() {

        int i = 0;
        while (i < sample) {
            population *= (1 + growthRate);
            populationProj[0][i] = population;

            populationProj[1][i] = (i == 0) ?
                    population - basePopulation :
                    population - populationProj[0][i - 1];
            i++;
        }
       /* for (int i = 0; i < sample; i++) {
            population *= (1 + growthRate);
            populationProj[0][i] = population;

            populationProj[1][i] = (i == 0) ?
                    population - basePopulation :
                    population - populationProj[0][i - 1];
        }*/
        return populationProj;
    }
}
