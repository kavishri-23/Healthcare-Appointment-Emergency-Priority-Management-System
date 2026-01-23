package dao;

import dto.LoginAttemptDTO;

public interface LoginAttemptDAO {

    // Stores every login attempt into database
    void logAttempt(LoginAttemptDTO attempt);

    // Counts failed login attempts for a specific user
    int countFailedAttempts(String username);
}
