package oop.Labs__7.LabWork__2_7_1_till_2_7_5;

public class Main {
    public static void main(String[] args) {

        final int QUANTITY_OF_DEVICES = 4;
        Device[] device = new Device[QUANTITY_OF_DEVICES];
        device[0] = new Monitor("ASUS", 300, "23", 1920, 1080);
        device[1] = new Monitor("DELL", 290, "21", 1920, 1080);
        device[2] = new EthernetAdapter("D-Link", 15, "11.22.4.1", 602, "10");
        device[3] = new EthernetAdapter("TP-Link", 19, "21.12.4.1", 802, "10");

        for (Device devices : device) {
            System.out.println(devices + "\n");
        }
    }
}
