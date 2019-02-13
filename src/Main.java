class Main {

    public static void main(String[] args) {

        ComponentType component1 = new ComponentType("Procesor", "Producent procesorów","1435653");
        ComponentType component2 = new ComponentType("Pamięć RAM","Producent pamięci komputerowych","2232312312");
        ComponentType component3 = new ComponentType("Dysk twardy","Producent pamięci komputerowych","32321312");

        Processor processor = new Processor(component1, 3000,36,70,33);
        RandomAccessMemory randomAccessMemory = new RandomAccessMemory(component2,1066,39, 75,33,6000);
        HardDisk hardDisk = new HardDisk(component3,100000);

        Computer computer = new Computer(processor, randomAccessMemory, hardDisk);

        System.out.println(processor.toString());
        System.out.println(randomAccessMemory.toString());
        System.out.println(hardDisk.toString());

        //poprawne podkręcenie
        try {
            processor.increaseClockSignal(200); //prawidłowa wartość
        } catch (ToHighTemperatureValue e) {
            System.err.println(e.getMessage());
        }
        //niepoprawne podkręcenie
        try {
            processor.increaseClockSignal(500); //nieprawidłowa wartość
        } catch (ToHighTemperatureValue e) {
            System.err.println(e.getMessage());
        }

        //poprawne podkręcenie
        try {
            randomAccessMemory.increaseClockSignal(150); //prawidłowa wartość
        } catch (ToHighTemperatureValue e) {
            System.err.println(e.getMessage());
        }

        //niepoprawne podkręcenie
        try {
            randomAccessMemory.increaseClockSignal(750); //nieprawidłowa wartość
        } catch (ToHighTemperatureValue e) {
            System.err.println(e.getMessage());
        }

    }
}