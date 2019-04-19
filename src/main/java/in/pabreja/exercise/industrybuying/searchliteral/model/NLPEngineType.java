package in.pabreja.exercise.industrybuying.searchliteral.model;

public enum NLPEngineType {
    GOOGLE("google"),
    IBM("ibm"),
    CUBE("cube"),
    INDUSTRY_BUYING("truth")
    ;

    private String type;

    public String getType() {
        return type;
    }

    NLPEngineType(String type){
        this.type = type;
    }
}
