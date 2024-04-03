package com.beyonder.hexagonalarchitecture.adapter.persistence;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
