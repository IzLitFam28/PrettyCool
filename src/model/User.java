package model;

import observer.DeviceObserver;

public class User implements DeviceObserver {

	private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String deviceName, String state) {
        System.out.println(name + " diberi notifikasi: Perangkat " + deviceName + " sekarang dalam status " + state);
    }

    public void controlDevice(Device device, String action) {
        System.out.println(name + " mencoba mengontrol perangkat " + device.getName() + " untuk " + action);
        switch (action.toUpperCase()) {
            case "ON":
                device.turnOn();
                break;
            case "OFF":
                device.turnOff();
                break;
            case "COOL":
                device.cool();
                break;
            case "HEAT":
                device.heat();
                break;
            case "IDLE":
                device.idle();
                break;
            default:
                System.out.println("Aksi tidak dikenal: " + action);
        }
    }
	
}
