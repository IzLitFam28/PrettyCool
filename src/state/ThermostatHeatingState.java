package state;

import model.Device;

public class ThermostatHeatingState implements ThermostatState {

	private Device device;

    public ThermostatHeatingState(Device device) {
        this.device = device;
    }

    @Override
    public void heat() {
        System.out.println("Termostat " + device.getName() + " sudah MEMANASKAN.");
    }

    @Override
    public void cool() {
        System.out.println("Mengalihkan termostat " + device.getName() + " ke MENDINGINKAN.");
        device.setThermostatState(new ThermostatCoolingState(device));
    }

    @Override
    public void idle() {
        System.out.println("Mengalihkan termostat " + device.getName() + " ke DIAM.");
        device.setThermostatState(new ThermostatIdleState(device));
    }
	
}
