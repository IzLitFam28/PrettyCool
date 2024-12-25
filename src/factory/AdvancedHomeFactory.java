package factory;

import model.Device;

public class AdvancedHomeFactory implements DeviceFactory {

	@Override
    public Device createLight() {
        return new Device("Lampu Pintar", "Lampu");
    }

    @Override
    public Device createThermostat() {
        return new Device("Termostat Pintar", "Termostat");
    }

    @Override
    public Device createCamera() {
        return new Device("Kamera Keamanan AI", "Kamera");
    }
	
}
