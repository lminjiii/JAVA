package service;

import repository.ListRepository;
import view.UserView;
import vo.Product;

public class UserService {
    ListRepository repository = new ListRepository();

    public boolean srveItem(int userMoney, String itemName) {
        //찾는 제품이 있는지 확인
        Product findItem = repository.findByName(itemName);
        //제품이 있고,잔동이 충분한지 확인
        if (findItem != null && findItem.getPrice() <= userMoney && findItem.getStock() > 0) {
            //제품을 구매
            findItem.setStock(findItem.getStock() - 1);
            //수정 처리
            //충분하면 재고에서 -1하고 true 리턴
            repository.update(repository.findIndex(itemName), findItem);
            //사용자 잔액 감소
            UserView.userMoney = UserView.userMoney - findItem.getPrice();
            return true;
        } else if (findItem == null) {
            //그렇지 않으면 false 리턴
            //제품이 없을 때
            System.out.println("찾는 제품이 없습니다");
            return false;
        } else if (findItem.getPrice() > userMoney) {
            //그렇지 않으면 false 리턴
            //잔돈이 부족할 떄
            System.out.println("잔돈이 부족합니다");
            return false;
        } else if (findItem.getStock() == 0) {
            System.out.println("제품이 없습니다.");
            return false;
        } else{
            return false;
        }
    }
}
