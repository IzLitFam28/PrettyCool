package main;

import controller.SmartHome;
import factory.BasicHomeFactory;
import factory.DeviceFactory;
import model.Device;
import model.User;

public class Main {

	public Main() {
		// Membuat rumah pintar berdasarkan jenis (Rumah Dasar)
        System.out.println("Membuat Rumah Dasar:");
        DeviceFactory basicFactory = new BasicHomeFactory();
        SmartHome basicHome = new SmartHome(basicFactory);

        // Tambahkan observer untuk melihat perubahan status perangkat
        User alice = new User("Alice");
        User bob = new User("Bob");

        Device lamp = new Device("Lampu Biasa", "Lampu");
        lamp.addObserver(alice);
        lamp.addObserver(bob);

        Device thermostat = new Device("Termostat Standar", "Termostat");
        thermostat.addObserver(alice);

        // Mengontrol perangkat di rumah pintar
        System.out.println("\nMengontrol Lampu:");
        basicHome.changeDeviceState("Lampu Biasa", "ON");
        basicHome.changeDeviceState("Lampu Biasa", "OFF");

        System.out.println("\nMengontrol Termostat:");
        basicHome.changeDeviceState("Termostat Standar", "COOL");
        basicHome.changeDeviceState("Termostat Standar", "HEAT");
        basicHome.changeDeviceState("Termostat Standar", "IDLE");

        // Menampilkan daftar perangkat dengan status terkini
        basicHome.listDevices();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
