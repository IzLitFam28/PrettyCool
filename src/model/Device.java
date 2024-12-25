package model;

public class Device {

	private String name;
    private String type;
    private String state;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        this.state = "OFF"; // Semua perangkat dimulai dalam keadaan OFF
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("Perangkat " + name + " sekarang " + state);
    }
	
}
