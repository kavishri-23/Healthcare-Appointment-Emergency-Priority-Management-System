package service;

import dao.LoginAttemptDAO;
import dao.LoginAttemptDAOImpl;
import dto.LoginAttemptDTO;

public class LoginService {

    private LoginAttemptDAO dao = new LoginAttemptDAOImpl();

    // Simulated login method
    public void login(String username, String ipAddress, boolean success) {

        // Create DTO object
        LoginAttemptDTO attempt =
            new LoginAttemptDTO(0, username, ipAddress,
                    success ? "SUCCESS" : "FAILED");

        // Store attempt in database
        dao.logAttempt(attempt);

        // Security logic: check failed attempts
        if (!success) {
            int failedCount = dao.countFailedAttempts(username);

            if (failedCount >= 3) {
                System.out.println(
                    "⚠ SECURITY ALERT: Account locked for user: " + username);
            }
        }
    }
}
