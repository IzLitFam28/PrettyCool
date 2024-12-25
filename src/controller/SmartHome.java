package controller;

import java.util.ArrayList;

import factory.DeviceFactory;
import iterator.DeviceIterable;
import iterator.DeviceIterator;
import iterator.SmartHomeDeviceIterator;
import model.Device;
import proxy.SecurityCamera;
import proxy.SecurityCameraProxy;

public class SmartHome implements DeviceIterable {

	private ArrayList<Device> devices;
    private SecurityCameraProxy cameraProxy;

    public SmartHome(DeviceFactory factory) {
        devices = new ArrayList<>();
        devices.add(factory.createLight());
        devices.add(factory.createThermostat());
        
        // Kamera menggunakan Proxy
        SecurityCamera camera = new SecurityCamera(factory.createCamera().getName());
        cameraProxy = new SecurityCameraProxy(camera);
    }

    public void addAuthorizedUser(String user) {
        cameraProxy.addAuthorizedUser(user);
    }

    public void accessCamera(String user) {
        cameraProxy.accessCamera(user);
    }

    public void listDevices() {
        System.out.println("\nDaftar Perangkat di Rumah Pintar (Menggunakan Iterator):");
        DeviceIterator iterator = createIterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
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

    @Override
    public DeviceIterator createIterator() {
        return new SmartHomeDeviceIterator(devices);
    }
	
}
