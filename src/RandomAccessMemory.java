class RandomAccessMemory extends ComputerArchitecture {

    private double amountOfMemory;

    public RandomAccessMemory(ComponentType componentType, double clockSignal, double standardTemperature, double maxTemperature, double temperature, double amountOfMemory) {
        super(componentType, clockSignal, standardTemperature, maxTemperature, temperature);
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    void increaseClockSignal(double value) {
        if(this.getTemperature() + value / 15 > getMaxTemperature()) throw new ToHighTemperatureValue("Podkręcenie spowoduje nadmierny wzrost temperatury. Operacja przerwana.");
        else {
            this.setClockSignal(this.getClockSignal() + value);
            this.setTemperature(this.getTemperature() + value / 15);
        }
    }

    public double getAmountOfMemory() {
        return amountOfMemory;
    }

    public void setAmountOfMemory(double amountOfMemory) {
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return super.toString() + ", pamięć = " + (amountOfMemory/1000) + " GB";
    }
}