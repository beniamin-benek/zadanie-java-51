class Computer {

    private Processor processor;
    private RandomAccessMemory randomAccessMemory;
    private HardDisk hardDisk;

    public Computer(Processor processor, RandomAccessMemory randomAccessMemory, HardDisk hardDisk) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
    }

    public Computer() {

    }

}