package repository;

import db.dbConn;
import dto.ProductDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductRepositoryInterface {

    Connection dbConn = db.dbConn.DBConn.getConnection();

    @Override
    public List<ProductDto> getAllProduct() {

        String sql = "SELECT * FROM product";

        List<ProductDto> productList = new ArrayList<>();

        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            ResultSet rs = psmt.executeQuery();
            while (rs.next()){
                ProductDto product = new ProductDto();
                product.setProductId(rs.getInt("p_id"));
                product.setProductName(rs.getString("p_name"));
                product.setPrice(rs.getInt("p_price"));
                product.setStock(rs.getInt("p_stock"));
                productList.add(product);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public ProductDto getProductbyId(int productId) {
        String sql = "SELECT * FROM product WHERE p_id = ?";
        try(PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, productId);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()){
                ProductDto product = new ProductDto();
                product.setProductId(rs.getInt("p_id"));
                product.setProductName(rs.getString("p_name"));
                product.setPrice(rs.getInt("p_price"));
                product.setStock(rs.getInt("p_stock"));
                return product;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateProductStock(int productId, int quantity) {
        String sql = "UPDATE product SET p_stock = p_stock - ? WHERE p_id = ? AND p_stock >= ?";
        try(PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, quantity);
            psmt.setInt(2, productId);
            psmt.setInt(3,quantity);
            int update = psmt.executeUpdate();
            if (update == 0) {
                System.out.println("재고가 부족하거나 제품 ID가 유효하지 않습니다." + productId);
            }
            return update;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int decreaseProductStock(int productId) {
        String sql = "UPDATE product SET p_stock = p_stock - 1 WHERE p_id = ? AND p_stock > 0";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, productId);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deductUserBalance(String userId, int money) {
        String sql = "UPDATE user SET money = money - ? WHERE u_id = ? AND money >= ?";
        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {
            psmt.setInt(1, money);
            psmt.setString(2, userId);
            psmt.setInt(3, money);
            return psmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int savePurchaseRecord(String userId, int productId, int price) {
        String sql = "INSERT INTO sales (u_id, p_id, s_price, sale_date) " +
                "VALUES (?, ?, ?, NOW())";

        try (PreparedStatement psmt = dbConn.prepareStatement(sql)) {

            psmt.setString(1, userId);
            psmt.setInt(2, productId);
            psmt.setInt(3, price);
            return psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
