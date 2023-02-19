package BuilderDesignPattern.Director;

public class F16Builder implements AircraftBuilder {
    private Aircraft f16;

    public F16Builder() {
        f16 = new Aircraft();
    }

    @Override
    public void addEngine() {
        this.f16.setEngine("Pratt & Whitney, General Electric turbofan engine");
    }

    @Override
    public void addWings() {
        this.f16.setWings(20.2);
    }

    @Override
    public void addCockpit() {
        this.f16.setCockpit(280);
    }

    @Override
    public void addBathrooms() {
        this.f16.setBathrooms(0);
    }

    @Override
    public Aircraft build() {
        return this.f16;
    }
}
