package dao;

import dto.LoginAttemptDTO;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginAttemptDAOImpl implements LoginAttemptDAO {

    // Insert login attempt into database
    @Override
    public void logAttempt(LoginAttemptDTO attempt) {

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                "INSERT INTO login_attempts(username, ip_address, status) VALUES(?,?,?)";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, attempt.getUsername());
            pst.setString(2, attempt.getIpAddress());
            pst.setString(3, attempt.getStatus());

            pst.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Count number of FAILED attempts for a user
    @Override
    public int countFailedAttempts(String username) {

        int count = 0;

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                "SELECT COUNT(*) FROM login_attempts WHERE username=? AND status='FAILED'";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}
