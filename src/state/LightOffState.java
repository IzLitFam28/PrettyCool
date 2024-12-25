package state;

import model.Device;

public class LightOffState implements DeviceState {

	private Device device;

    public LightOffState(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Lampu " + device.getName() + " sekarang MENYALA.");
        device.setState(new LightOnState(device));
    }

    @Override
    public void turnOff() {
        System.out.println("Lampu " + device.getName() + " sudah MATI.");
    }
	
}
