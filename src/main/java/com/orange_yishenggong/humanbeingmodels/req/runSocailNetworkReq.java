package com.orange_yishenggong.humanbeingmodels.req;

public class runSocailNetworkReq {
    private int gridLength;
    private int population;
    private int rounds;
    private int recomType;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getRecomType() {
        return recomType;
    }

    public void setRecomType(int recomType) {
        this.recomType = recomType;
    }

    public int getGridLength() {
        return gridLength;
    }

    public void setGridLength(int gridLength) {
        this.gridLength = gridLength;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("runSocailNetworkReq{");
        sb.append("gridLength=").append(gridLength);
        sb.append(", population=").append(population);
        sb.append(", rounds=").append(rounds);
        sb.append(", recomType=").append(recomType);
        sb.append('}');
        return sb.toString();
    }
}
