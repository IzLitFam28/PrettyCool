package controller;

import java.util.ArrayList;

import model.Device;

public class SmartHome {

	private ArrayList<Device> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void listDevices() {
        System.out.println("\nDaftar Perangkat di Rumah Pintar:");
        for (Device device : devices) {
            System.out.println("- " + device.getName() + " (" + device.getType() + ") : " + device.getState());
        }
    }

    public void changeDeviceState(String deviceName, String newState) {
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(deviceName)) {
                device.setState(newState);
                return;
            }
        }
        System.out.println("Perangkat dengan nama '" + deviceName + "' tidak ditemukan.");
    }
	
}
