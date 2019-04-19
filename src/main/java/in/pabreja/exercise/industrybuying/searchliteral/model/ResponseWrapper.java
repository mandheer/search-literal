package in.pabreja.exercise.industrybuying.searchliteral.model;

import java.util.Map;

public class ResponseWrapper {
    private long total_matches;
    private Map<String,Double> truth;
    private Map<String,Double> cube;
    private Map<String,Double> google;
    private Map<String,Double> ibm;

    public long getTotal_matches() {
        return total_matches;
    }

    public void setTotal_matches(long total_matches) {
        this.total_matches = total_matches;
    }

    public Map<String, Double> getTruth() {
        return truth;
    }

    public void setTruth(Map<String, Double> truth) {
        this.truth = truth;
    }

    public Map<String, Double> getCube() {
        return cube;
    }

    public void setCube(Map<String, Double> cube) {
        this.cube = cube;
    }

    public Map<String, Double> getGoogle() {
        return google;
    }

    public void setGoogle(Map<String, Double> google) {
        this.google = google;
    }

    public Map<String, Double> getIbm() {
        return ibm;
    }

    public void setIbm(Map<String, Double> ibm) {
        this.ibm = ibm;
    }
}
