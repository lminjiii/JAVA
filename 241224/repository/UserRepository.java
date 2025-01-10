package repository;

import dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository implements UserRepositoryInterface {

    int result = 0;
    Connection dbConn = db.dbConn.DBConn.getConnection();
    PreparedStatement psmt = null;
    String sql;

    @Override
    public int singUpDate(UserDto dto) {
        try {
            sql = "INSERT INTO user (u_id, password, nickname, phone)";
            sql = sql + "VALUES (?, ?, ?, ?)";
            psmt = dbConn.prepareStatement(sql);
            psmt.setString(1, dto.getId());
            psmt.setString(2, dto.getPassword());
            psmt.setString(3, dto.getNickname());
            psmt.setString(4, dto.getPhone());
            return psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public UserDto getuserByID(String id) {
        String sql = "SELECT * FROM user WHERE u_id = ?";
        try(PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, id);
            ResultSet rs = psmt.executeQuery();

            if (rs.next()) {
                UserDto member = new UserDto();
                member.setId(rs.getString("u_id"));
                member.setPassword(rs.getString("password"));
                member.setNickname(rs.getString("nickname"));
                member.setPhone(rs.getString("phone"));
                return member;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateUser(String userId, int money) {
        String sql = "UPDATE user SET money = money + ? WHERE u_id = ?";
        try(PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, money);
            psmt.setString(2, userId);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int getUserBlance(String userId) {
        String sql = "SELECT money FROM user WHERE u_id = ?";
        try(PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, userId);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("money");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateUserBlance(String userId, int money) {
        String sql = "UPDATE user SET money = money + ? WHERE u_id = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)){
            psmt.setInt(1, money);
            psmt.setString(2, userId);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
