package BuilderDesignPattern.Director;

public interface AircraftBuilder {
    public abstract void addEngine();

    public abstract void addWings();

    public abstract void addCockpit();

    public abstract void addBathrooms();

    public abstract Aircraft build();
}