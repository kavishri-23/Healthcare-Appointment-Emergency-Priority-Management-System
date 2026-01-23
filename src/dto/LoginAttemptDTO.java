package dto;

public class LoginAttemptDTO {

    private int attemptId;
    private String username;
    private String ipAddress;
    private String status;

    // Default constructor
    public LoginAttemptDTO() {
    }

    // Parameterized constructor
    public LoginAttemptDTO(int attemptId, String username,
                           String ipAddress, String status) {
        this.attemptId = attemptId;
        this.username = username;
        this.ipAddress = ipAddress;
        this.status = status;
    }

    public int getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(int attemptId) {
        this.attemptId = attemptId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

