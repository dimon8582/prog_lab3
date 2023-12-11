package enums;

public enum Emotion {
    NEUTRAL("ни о чем не переживает"),
    SHAME("стыдно сейчас"),
    FEAR("очень страшно"),
    ANGER("очень зол"),
    CARELESS("испытывает безразличие"),
    HAPPY("очень счастлив"),
    SAD("испытывает грусть");

    private String incase;

    public String getIncase() {
        return incase;
    }
    Emotion(String incase) {
        this.incase = incase;
    }
}
