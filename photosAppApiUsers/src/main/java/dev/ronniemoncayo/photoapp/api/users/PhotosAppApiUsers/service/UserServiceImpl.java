package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.data.UserEntity;
import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.data.UsersRepository;
import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.shared.UserDto;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        ModelMapper mm = new ModelMapper();
        mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mm.map(userDetails, UserEntity.class);
        userEntity.setEncryptedPassword("test");

        usersRepository.save(userEntity);

        UserDto returnValue = mm.map(userEntity, UserDto.class);
        return returnValue;
    }

}