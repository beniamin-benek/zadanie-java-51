class HardDisk {

    private ComponentType HardDisk;
    private double amountOfMemory;

    public HardDisk(ComponentType hardDisk, double amountOfMemory) {
        HardDisk = hardDisk;
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return "Komponent: " + HardDisk.getName() +
                ", pamięć = " + (amountOfMemory/1000) + " GB";
    }
}