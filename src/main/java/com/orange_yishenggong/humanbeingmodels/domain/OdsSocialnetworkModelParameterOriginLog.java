package com.orange_yishenggong.humanbeingmodels.domain;

public class OdsSocialnetworkModelParameterOriginLog {
    private Long id;

    private Long modelId;

    private Integer gridLength;

    private Integer population;

    private Integer rounds;

    private Integer recomType;

    private Long startTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Integer getGridLength() {
        return gridLength;
    }

    public void setGridLength(Integer gridLength) {
        this.gridLength = gridLength;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Integer getRecomType() {
        return recomType;
    }

    public void setRecomType(Integer recomType) {
        this.recomType = recomType;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modelId=").append(modelId);
        sb.append(", gridLength=").append(gridLength);
        sb.append(", population=").append(population);
        sb.append(", rounds=").append(rounds);
        sb.append(", recomType=").append(recomType);
        sb.append(", startTime=").append(startTime);
        sb.append("]");
        return sb.toString();
    }
}