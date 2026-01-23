package main;

import service.LoginService;

public class Main {

    public static void main(String[] args) {

        LoginService service = new LoginService();

        // Simulating failed login attempts
        service.login("admin", "192.168.1.10", false);
        service.login("admin", "192.168.1.10", false);
        service.login("admin", "192.168.1.10", false);

        // Simulating a successful login
        service.login("admin", "192.168.1.10", true);
    }
}
