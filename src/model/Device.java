package model;

import java.util.ArrayList;

import observer.DeviceObserver;
import observer.ObservableDevice;
import state.DeviceState;
import state.LightOffState;
import state.ThermostatIdleState;
import state.ThermostatState;

public class Device implements ObservableDevice {

	private String name;
    private String type;

    private DeviceState state;
    private ThermostatState thermostatState;

    private ArrayList<DeviceObserver> observers;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        observers = new ArrayList<>();

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
        notifyObservers(); // Beritahu observer saat status berubah
    }

    public void setThermostatState(ThermostatState state) {
        this.thermostatState = state;
        notifyObservers(); // Beritahu observer saat status berubah
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

    // Observer methods
    public void addObserver(DeviceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DeviceObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        String currentState = getStateName();
        for (DeviceObserver observer : observers) {
            observer.update(name, currentState);
        }
    }
}
