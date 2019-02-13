abstract class ComputerArchitecture {

    private ComponentType componentType;
    private double clockSignal;
    private double standardTemperature;
    private double maxTemperature;
    private double temperature;

    public ComputerArchitecture(ComponentType componentType, double clockSignal, double standardTemperature, double maxTemperature, double temperature) {
        this.componentType = componentType;
        this.clockSignal = clockSignal;
        this.standardTemperature = standardTemperature;
        this.maxTemperature = maxTemperature;
        this.temperature = temperature;
    }

    public ComputerArchitecture() {

    }

    public double getClockSignal() {
        return clockSignal;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }

    public double getStandardTemperature() {
        return standardTemperature;
    }

    public void setStandardTemperature(double standardTemperature) {
        this.standardTemperature = standardTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public String toString() {
        return  "Komponent: " + componentType.getName() +
                ", taktowanie = " + clockSignal + " MHz" +
                ", aktualna temperatura = " + temperature + " st.C" +
                ", temp. domyślna = " + standardTemperature + " st.C" +
                ", temp. maksymalna = " + maxTemperature + " st.C";
    }

    void increaseClockSignal(double value) {

    }

}