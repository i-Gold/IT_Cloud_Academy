package oop.Labs__01;

public class LabWork__2_1 {
    public static void main(String[] args) {

        final int NUMBER_OF_COMPUTER_COMPONENTS = 5;
        Computer[] computerObjects = new Computer[NUMBER_OF_COMPUTER_COMPONENTS];

        for (int i = 0; i < NUMBER_OF_COMPUTER_COMPONENTS; i++) {
            computerObjects[i] = new Computer();
        }

        for (Computer component : computerObjects){
            component.setPrice(component.getPrice() + 0.1f * component.getPrice());
        }

        for (Computer component : computerObjects) {
            component.view();
        }
    }
}

class Computer {
    
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {

        System.out.println("Manufacturer: " + getManufacturer() + "\n"
                         + "Serial Number: " + getSerialNumber() + "\n"
                         + "Price: " + getPrice() + "\n"
                         + "Quantity CPU: " + getQuantityCPU() + "\n"
                         + "Frequency CPU: " + getFrequencyCPU() + "\n");
    }
}
