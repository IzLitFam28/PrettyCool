package proxy;

public class SecurityCamera implements Camera {

	private String name;

    public SecurityCamera(String name) {
        this.name = name;
    }

    @Override
    public void accessCamera(String user) {
        System.out.println("[" + name + "] Akses diberikan kepada: " + user);
    }
	
}
