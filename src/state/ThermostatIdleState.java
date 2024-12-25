package state;

import model.Device;

public class ThermostatIdleState implements ThermostatState {

	private Device device;

    public ThermostatIdleState(Device device) {
        this.device = device;
    }

    @Override
    public void heat() {
        System.out.println("Termostat " + device.getName() + " sekarang MEMANASKAN.");
        device.setThermostatState(new ThermostatHeatingState(device));
    }

    @Override
    public void cool() {
        System.out.println("Termostat " + device.getName() + " sekarang MENDINGINKAN.");
        device.setThermostatState(new ThermostatCoolingState(device));
    }

    @Override
    public void idle() {
        System.out.println("Termostat " + device.getName() + " sudah dalam keadaan DIAM.");
    }
	
}
