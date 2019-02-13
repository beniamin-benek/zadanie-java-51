class Processor extends ComputerArchitecture {

    public Processor(ComponentType componentType, double clockSignal, double standardTemperature, double maxTemperature, double temperature) {
        super(componentType, clockSignal, standardTemperature, maxTemperature, temperature);
    }

    @Override
    void increaseClockSignal(double value) {
        if(this.getTemperature() + value / 10 > getMaxTemperature()) throw new ToHighTemperatureValue("Podkręcenie spowoduje nadmierny wzrost temperatury. Operacja przerwana.");
        else {
            this.setClockSignal(this.getClockSignal() + value);
            this.setTemperature(this.getTemperature() + value / 10);
        }
    }

}