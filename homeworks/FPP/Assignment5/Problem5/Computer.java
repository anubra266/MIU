package homeworks.FPP.Assignment5.Problem5;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + "\n" + "CPU: " + processor + "\n" + "RAM: " + ramSize + "GB\n"
                + "Processor Speed: " + processorSpeed + "GHz";
    }
}
