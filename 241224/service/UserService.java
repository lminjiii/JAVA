package service;

import dto.UserDto;
import dto.ProductDto;
import repository.AdminRepository;
import repository.ProductRepository;
import repository.UserRepository;

import java.util.List;

public class UserService implements UserServiceInterface{

    AdminRepository adminRepository = new AdminRepository();
    UserRepository userRepository = new UserRepository();
    ProductRepository productRepository = new ProductRepository();

    private final String ADMIN_ID = "admin";
    private final String ADMIN_PASSWORD = "admin1111";

    @Override
    public int signUpService(UserDto dto) {
        return userRepository.singUpDate(dto);
    }

    @Override
    public boolean isAdmin(String id, String password) {
        return ADMIN_ID.equals(id) && ADMIN_PASSWORD.equals(password);
    }

    @Override
    public boolean validateUser(String id, String password) {
        UserDto member = userRepository.getuserByID(id);
        return member != null && member.getPassword().equals(password);

    }

    @Override
    public boolean recharge(String userId, int money) {
        if (money <= 0 || money % 1000 != 0){
            System.out.println("충전 금액은 양수이고 천 원 단위만 가능합니다");
            return false;
        }
        int result = userRepository.updateUser(userId, money);
        if (result > 0){
            System.out.println("충전 성공! 충전 금액: " + money + "원");
            return true;
        }else {
            System.out.println("충전 실패! 관리자에게 문의하세요.");
            return false;
        }
    }
    @Override
    public boolean purchaseProduct(String userId, int productId) {
        ProductDto product = productRepository.getProductbyId(productId);

        if (product == null){
            System.out.println("유효하지 않은 제품 ID 입니다.");
            return false;
        }
        if (product.getStock() <= 0){
            System.out.println("해당 제품의 재고가 부족합니다");
            return false;
        }
        if (productRepository.deductUserBalance(userId, product.getPrice()) == 0) {
            System.out.println("충전금액이 부족합니다. 충전 후 다시 이용해주세요");
            return false;
        }
        if (productRepository.savePurchaseRecord(userId, productId, product.getPrice()) == 0) {
            System.out.println("구매 기록 저장에 실패했습니다.");
            return false;
        }
        if (productRepository.updateProductStock(productId, 1) >  0){
            System.out.println("구매 완료! 구매한 제품: " + product.getProductName());
            return true;
        }
        System.out.println("구매 실패. 다시 시도해주세요");
        return false;
    }

    @Override
    public int returnChange(String userId) {
        int currentBalance = userRepository.getUserBlance(userId);
        if (currentBalance > 0) {
            userRepository.updateUserBlance(userId, -currentBalance);
            System.out.println("잔돈 " + currentBalance + "원이 반환되었습니다.");
        } else {
            System.out.println("반환할 잔돈이 없습니다");
        }
        return currentBalance;
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return productRepository.getAllProduct();
    }

}

