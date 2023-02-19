package BuilderDesignPattern.Director;

public class AircraftDirector {
    private AircraftBuilder builder;

    public AircraftDirector(AircraftBuilder aircraftBuilder) {
        this.builder = aircraftBuilder;
    }

    public Aircraft build() {
        builder.addEngine();
        builder.addBathrooms();
        builder.addCockpit();
        builder.addWings();
        return builder.build();
    }
}
