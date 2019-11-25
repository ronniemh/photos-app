package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.service;

import java.util.UUID;

import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.shared.UserDto;

/**
 * UserServiceImpl
 */
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }

}