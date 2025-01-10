package repository;

import dto.ProductDto;
import dto.UserDto;

import java.util.List;
import java.util.Map;

public interface AdminRepositoryInterface {

    int addProduct(ProductDto product);

    int updateProduct(ProductDto product);

    int deleteProduct(int productId);

    List<ProductDto> getAllProduct();

    int addMember(UserDto user);

    int updateMember(UserDto user);

    int deleteMember(String userId);

    List<UserDto> getAllMember();

    List<Map<String, Object>> getProductSales();

    List<Map<String, Object>> getMemberSales();

    boolean recordPurchase(String userId, int productId, int purchasePrice);

}
