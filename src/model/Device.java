package model;

import state.DeviceState;
import state.LightOffState;
import state.ThermostatIdleState;
import state.ThermostatState;

public class Device {

	private String name;
    private String type;

    private DeviceState state;
    private ThermostatState thermostatState;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;

        if (type.equalsIgnoreCase("Lampu")) {
            this.state = new LightOffState(this); // Default state untuk lampu
        } else if (type.equalsIgnoreCase("Termostat")) {
            this.thermostatState = new ThermostatIdleState(this); // Default state untuk termostat
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public void setThermostatState(ThermostatState state) {
        this.thermostatState = state;
    }

    // Tambahkan metode untuk mendapatkan nama status
    public String getStateName() {
        if (state != null) {
            return "Lampu: " + state.getClass().getSimpleName();
        } else if (thermostatState != null) {
            return "Termostat: " + thermostatState.getClass().getSimpleName();
        }
        return "Tidak diketahui";
    }

    // State operations for Lampu
    public void turnOn() {
        if (state != null) state.turnOn();
    }

    public void turnOff() {
        if (state != null) state.turnOff();
    }

    // State operations for Termostat
    public void heat() {
        if (thermostatState != null) thermostatState.heat();
    }

    public void cool() {
        if (thermostatState != null) thermostatState.cool();
    }

    public void idle() {
        if (thermostatState != null) thermostatState.idle();
    }
	
}
