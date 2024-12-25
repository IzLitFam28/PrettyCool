package iterator;

import java.util.ArrayList;

import model.Device;

public class SmartHomeDeviceIterator implements DeviceIterator {

	private ArrayList<Device> devices;
    private int position;

    public SmartHomeDeviceIterator(ArrayList<Device> devices) {
        this.devices = devices;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < devices.size();
    }

    @Override
    public Device next() {
        if (!hasNext()) {
            throw new IllegalStateException("Tidak ada perangkat lagi.");
        }
        return devices.get(position++);
    }
	
}
