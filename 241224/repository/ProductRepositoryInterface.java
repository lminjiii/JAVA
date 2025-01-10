package repository;

import dto.ProductDto;

import java.util.List;

public interface ProductRepositoryInterface {
    List<ProductDto> getAllProduct();

    ProductDto getProductbyId(int productId);

    int updateProductStock(int productId, int quantity);

    int decreaseProductStock(int productId);

    int deductUserBalance(String userId, int money);

    int savePurchaseRecord(String userId, int productId, int price);

}
