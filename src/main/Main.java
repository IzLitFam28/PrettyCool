package main;

import controller.SmartHome;
import factory.BasicHomeFactory;
import factory.DeviceFactory;
import model.Device;

public class Main {

	public Main() {
		// Membuat rumah pintar berdasarkan jenis (Rumah Dasar)
        System.out.println("Membuat Rumah Dasar:");
        DeviceFactory basicFactory = new BasicHomeFactory();
        SmartHome basicHome = new SmartHome(basicFactory);
        basicHome.listDevices();

        // Mengontrol Lampu
        System.out.println("\nMengontrol Lampu:");
        Device lamp = new Device("Lampu Biasa", "Lampu");
        lamp.turnOn();
        lamp.turnOff();

        // Mengontrol Termostat
        System.out.println("\nMengontrol Termostat:");
        Device thermostat = new Device("Termostat Standar", "Termostat");
        thermostat.cool();
        thermostat.heat();
        thermostat.idle();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
