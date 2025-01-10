package repository;

import dto.ProductDto;
import dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminRepository implements AdminRepositoryInterface{

    Connection dbConn = db.dbConn.DBConn.getConnection();

    @Override
    public int addProduct(ProductDto product) {
        String sql = "INSERT INTO product (p_name, p_price, p_stock) VALUES (?, ?, ?)";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getPrice());
            psmt.setInt(3, product.getStock());
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateProduct(ProductDto product) {
        String sql = "UPDATE product SET p_name = ?, p_price = ?, p_stock = ? WHERE p_id = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, product.getProductName());
            psmt.setInt(2, product.getPrice());
            psmt.setInt(3, product.getStock());
            psmt.setInt(4, product.getProductId());
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteProduct(int productId) {
        String sql = " DELETE FROM product WHERE p_id = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, productId);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<ProductDto> getAllProduct() {
        String sql = "SELECT * FROM product";
        List<ProductDto> productList = new ArrayList<>();
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                ProductDto product = new ProductDto();
                product.setProductId(rs.getInt("p_id"));
                product.setProductName(rs.getString("p_name"));
                product.setPrice(rs.getInt("p_price"));
                product.setStock(rs.getInt("p_stock"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public int addMember(UserDto user) {
        String sql = " INSERT INTO user (u_id, password, nickname, phone, money) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, user.getId());
            psmt.setString(2, user.getPassword());
            psmt.setString(3, user.getNickname());
            psmt.setString(4, user.getPhone());
            psmt.setInt(5, user.getMoney());
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateMember(UserDto user) {
        String sql = "UPDATE user SET password = ?, nickname = ?, phone = ?, money = ? WHERE u_id = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, user.getPassword());
            psmt.setString(2, user.getNickname());
            psmt.setString(3, user.getPhone());
            psmt.setInt(4, user.getMoney());
            psmt.setString(5, user.getId());
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteMember(String userId) {
        String sql = "DELETE FROM user WHERE u_id = ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, userId);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<UserDto> getAllMember() {
        String sql = "SELECT * FROM user";
        List<UserDto> userDto = new ArrayList<>();
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                UserDto user = new UserDto();
                user.setId(rs.getString("u_id"));
                user.setPassword(rs.getString("password"));
                user.setNickname(rs.getString("nickname"));
                user.setPhone(rs.getString("phone"));
                user.setMoney(rs.getInt("money"));
                userDto.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userDto;
    }

    @Override
    public List<Map<String, Object>> getProductSales() {
        String sql = "SELECT p.p_name AS 제품명, COUNT(s.p_id) AS 판매수량, SUM(s.s_price) AS 판매금액\n" +
                "FROM sales s\n" +
                "JOIN product p ON s.p_id = p.p_id\n" +
                "GROUP BY s.p_id";
        List<Map<String, Object>> salesDate = new ArrayList<>();
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("제품명", rs.getString("제품명"));
                row.put("판매수량", rs.getInt("판매수량"));
                row.put("판매금액", rs.getInt("판매금액"));
                salesDate.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salesDate;
    }

    @Override
    public List<Map<String, Object>> getMemberSales() {
        String sql = "SELECT u.u_id AS 회원아이디, u.nickname AS 회원명, \n" +
                "       SUM(s.s_price) AS 구매금액, u.money AS 충전잔액\n" +
                "FROM sales s\n" +
                "LEFT JOIN user u ON s.u_id = u.u_id\n" +
                "GROUP BY s.u_id;";
        List<Map<String, Object>> memberSales = new ArrayList<>();
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("회원아이디", rs.getString("회원아이디"));
                row.put("회원명", rs.getString("회원명"));
                row.put("구매금액", rs.getInt("구매금액"));
                row.put("충전잔액", rs.getInt("충전잔액"));
                memberSales.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memberSales;
    }

    @Override
    public boolean recordPurchase(String userId, int productId, int purchasePrice) {
        String sql = "INSERT INTO sales (u_id, p_id, s_price, sale_date) " +
                "VALUES (?, ?, ?, CURRENT_DATE)";

        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setString(1, userId);
            psmt.setInt(2, productId);
            psmt.setInt(3, purchasePrice);

            int rowsAffected = psmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("구매 기록이 저장되었습니다.");
                return true;
            } else {
                System.out.println("구매 기록 저장에 실패했습니다.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
