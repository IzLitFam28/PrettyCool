package main;

import controller.SmartHome;
import model.Device;
import model.User;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		// Membuat rumah pintar
        SmartHome home = new SmartHome();

        // Menambahkan perangkat
        home.addDevice(new Device("Lampu Ruang Tamu", "Lampu"));
        home.addDevice(new Device("Termostat", "Termostat"));
        home.addDevice(new Device("Kamera Keamanan", "Kamera"));

        // Menampilkan daftar perangkat
        home.listDevices();

        // Pengguna mengontrol perangkat
        User user = new User("Alice");
        user.controlDevice(home, "Lampu Ruang Tamu", "ON");
        user.controlDevice(home, "Termostat", "COOLING");
        user.controlDevice(home, "Kamera Keamanan", "ON");

        // Menampilkan status perangkat setelah perubahan
        home.listDevices();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
