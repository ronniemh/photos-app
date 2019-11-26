package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UsersRepository
 */
public interface UsersRepository extends JpaRepository<UserEntity, Long>{

    
}