package BuilderDesignPattern.Director;

public class Boeing747Builder implements AircraftBuilder {
    private Aircraft boeing747;

    public Boeing747Builder() {
        boeing747 = new Aircraft();
    }

    @Override
    public void addEngine() {
        this.boeing747.setEngine("CF6-80C2B5F, Pratt & Whitney 4062, Rolls- Royce RB211-524H2-T");
    }

    @Override
    public void addWings() {
        this.boeing747.setWings(37.5);
    }

    @Override
    public void addCockpit() {
        this.boeing747.setCockpit(239.5);
    }

    @Override
    public void addBathrooms() {
        this.boeing747.setBathrooms(2);
    }

    @Override
    public Aircraft build() {
        return this.boeing747;
    }
}
