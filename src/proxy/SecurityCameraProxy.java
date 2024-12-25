package proxy;

import java.util.ArrayList;

public class SecurityCameraProxy implements Camera {

	private SecurityCamera camera;
    private ArrayList<String> authorizedUsers;

    public SecurityCameraProxy(SecurityCamera camera) {
        this.camera = camera;
        this.authorizedUsers = new ArrayList<>();
    }

    // Menambahkan pengguna yang diotorisasi
    public void addAuthorizedUser(String user) {
        authorizedUsers.add(user);
        System.out.println("Pengguna " + user + " diotorisasi untuk mengakses kamera.");
    }

    @Override
    public void accessCamera(String user) {
        System.out.println("[" + camera.getClass().getSimpleName() + "] Mencoba akses kamera oleh: " + user);

        if (authorizedUsers.contains(user)) {
            camera.accessCamera(user);
        } else {
            System.out.println("[" + camera.getClass().getSimpleName() + "] Akses ditolak untuk: " + user);
        }
    }
	
}
