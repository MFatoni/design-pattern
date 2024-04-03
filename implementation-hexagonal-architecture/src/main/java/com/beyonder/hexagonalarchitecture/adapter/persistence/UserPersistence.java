package com.beyonder.hexagonalarchitecture.adapter.persistence;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.out.CreateUserPort;
import com.beyonder.hexagonalarchitecture.service.out.GetAllUserPort;
import com.beyonder.hexagonalarchitecture.service.out.UpdateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistence implements GetAllUserPort, CreateUserPort, UpdateUserPort {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }


    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(int id, UserEntity userEntity) {
        userEntity.setId(id);
        return userRepository.save(userEntity);
    }

}
