package repository;

import dto.UserDto;

public interface UserRepositoryInterface {

    int singUpDate(UserDto dto);

    UserDto getuserByID(String id);

    int updateUser(String userId, int money);

    int getUserBlance(String userId);

    int updateUserBlance(String userId, int money);
}
