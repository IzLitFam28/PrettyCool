package factory;

import model.Device;

public interface DeviceFactory {
    Device createLight();
    Device createThermostat();
    Device createCamera();
}
