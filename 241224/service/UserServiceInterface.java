package service;

import dto.UserDto;
import dto.ProductDto;

import java.util.List;

public interface UserServiceInterface {

    int signUpService(UserDto dto);

    boolean isAdmin(String id, String password);

    boolean validateUser(String id, String password);

    boolean recharge(String userId, int money);

    boolean purchaseProduct(String userId, int productId);

    int returnChange(String userId);

    List<ProductDto> getAllProduct();

}
