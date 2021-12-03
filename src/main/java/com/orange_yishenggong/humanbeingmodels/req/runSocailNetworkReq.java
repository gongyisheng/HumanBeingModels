package com.orange_yishenggong.humanbeingmodels.req;

public class runSocailNetworkReq {
    private int explorerNum;
    private int gridLength;
    private int rounds;
    private int recommendType;

    public int getExplorerNum() {
        return explorerNum;
    }

    public void setExplorerNum(int explorerNum) {
        this.explorerNum = explorerNum;
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

    public int getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(int recommendType) {
        this.recommendType = recommendType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("runSocailNetworkReq{");
        sb.append("explorerNum=").append(explorerNum);
        sb.append(", gridLength=").append(gridLength);
        sb.append(", rounds=").append(rounds);
        sb.append(", recommendType=").append(recommendType);
        sb.append('}');
        return sb.toString();
    }
}
