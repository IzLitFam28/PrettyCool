package state;

import model.Device;

public class ThermostatCoolingState implements ThermostatState {

	private Device device;

    public ThermostatCoolingState(Device device) {
        this.device = device;
    }

    @Override
    public void heat() {
        System.out.println("Mengalihkan termostat " + device.getName() + " ke MEMANASKAN.");
        device.setThermostatState(new ThermostatHeatingState(device));
    }

    @Override
    public void cool() {
        System.out.println("Termostat " + device.getName() + " sudah MENDINGINKAN.");
    }

    @Override
    public void idle() {
        System.out.println("Mengalihkan termostat " + device.getName() + " ke DIAM.");
        device.setThermostatState(new ThermostatIdleState(device));
    }
	
}
