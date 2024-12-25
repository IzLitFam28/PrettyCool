package model;

import controller.SmartHome;

public class User {

	private String name;

    public User(String name) {
        this.name = name;
    }

    public void controlDevice(SmartHome home, String deviceName, String action) {
        System.out.println(name + " mencoba mengontrol perangkat " + deviceName + " untuk " + action);
        home.changeDeviceState(deviceName, action);
    }
	
}
