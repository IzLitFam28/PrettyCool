package main;

import controller.SmartHome;
import factory.AdvancedHomeFactory;
import factory.BasicHomeFactory;
import factory.DeviceFactory;

public class Main {

	public Main() {
		// Membuat rumah pintar berdasarkan jenis (Rumah Dasar)
        System.out.println("Membuat Rumah Dasar:");
        DeviceFactory basicFactory = new BasicHomeFactory();
        SmartHome basicHome = new SmartHome(basicFactory);
        basicHome.listDevices();

        // Menambahkan pengguna yang diotorisasi
        basicHome.addAuthorizedUser("Alice");

        // Pengguna mencoba mengakses kamera
        System.out.println("\nPengguna mencoba mengakses kamera:");
        basicHome.accessCamera("Alice"); // Akses diberikan
        basicHome.accessCamera("Bob");  // Akses ditolak

        // Membuat rumah pintar berdasarkan jenis (Rumah Canggih)
        System.out.println("\nMembuat Rumah Canggih:");
        DeviceFactory advancedFactory = new AdvancedHomeFactory();
        SmartHome advancedHome = new SmartHome(advancedFactory);
        advancedHome.listDevices();

        // Menambahkan pengguna yang diotorisasi
        advancedHome.addAuthorizedUser("Bob");

        // Pengguna mencoba mengakses kamera
        System.out.println("\nPengguna mencoba mengakses kamera:");
        advancedHome.accessCamera("Alice"); // Akses ditolak
        advancedHome.accessCamera("Bob");   // Akses diberikan
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
