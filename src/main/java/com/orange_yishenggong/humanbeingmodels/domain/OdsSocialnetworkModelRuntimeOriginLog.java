package com.orange_yishenggong.humanbeingmodels.domain;

public class OdsSocialnetworkModelRuntimeOriginLog {
    private Long id;

    private Long modelId;

    private Integer round;

    private Double averageScore;

    private Integer recomCount;

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

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Integer getRecomCount() {
        return recomCount;
    }

    public void setRecomCount(Integer recomCount) {
        this.recomCount = recomCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modelId=").append(modelId);
        sb.append(", round=").append(round);
        sb.append(", averageScore=").append(averageScore);
        sb.append(", recomCount=").append(recomCount);
        sb.append("]");
        return sb.toString();
    }
}