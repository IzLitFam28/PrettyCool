package main;

import controller.SmartHome;
import factory.AdvancedHomeFactory;
import factory.BasicHomeFactory;
import factory.DeviceFactory;
import model.User;

public class Main {

	public Main() {
		// Membuat rumah pintar berdasarkan jenis (Rumah Dasar)
        System.out.println("Membuat Rumah Dasar:");
        DeviceFactory basicFactory = new BasicHomeFactory();
        SmartHome basicHome = new SmartHome(basicFactory);
        basicHome.listDevices();

        // Pengguna mencoba mengontrol perangkat di Rumah Dasar
        System.out.println("\nPengguna mencoba mengontrol perangkat di Rumah Dasar:");
        User user1 = new User("Alice");
        user1.controlDevice(basicHome, "Lampu Biasa", "ON");
        user1.controlDevice(basicHome, "Termostat Standar", "COOLING");
        basicHome.listDevices();

        // Membuat rumah pintar berdasarkan jenis (Rumah Canggih)
        System.out.println("\nMembuat Rumah Canggih:");
        DeviceFactory advancedFactory = new AdvancedHomeFactory();
        SmartHome advancedHome = new SmartHome(advancedFactory);
        advancedHome.listDevices();

        // Pengguna mencoba mengontrol perangkat di Rumah Canggih
        System.out.println("\nPengguna mencoba mengontrol perangkat di Rumah Canggih:");
        User user2 = new User("Bob");
        user2.controlDevice(advancedHome, "Lampu Pintar", "ON");
        user2.controlDevice(advancedHome, "Kamera Keamanan AI", "ON");
        advancedHome.listDevices();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
