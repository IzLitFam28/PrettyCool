package state;

import model.Device;

public class LightOnState implements DeviceState {

	private Device device;

    public LightOnState(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Lampu " + device.getName() + " sudah MENYALA.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lampu " + device.getName() + " sekarang MATI.");
        device.setState(new LightOffState(device));
    }
	
}
