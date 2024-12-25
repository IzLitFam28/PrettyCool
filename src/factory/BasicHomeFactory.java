package factory;

import model.Device;

public class BasicHomeFactory implements DeviceFactory {

	@Override
    public Device createLight() {
        return new Device("Lampu Biasa", "Lampu");
    }

    @Override
    public Device createThermostat() {
        return new Device("Termostat Standar", "Termostat");
    }

    @Override
    public Device createCamera() {
        return new Device("Kamera Biasa", "Kamera");
    }

}
