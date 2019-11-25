package dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.service;

import dev.ronniemoncayo.photoapp.api.users.PhotosAppApiUsers.shared.UserDto;

/**
 * UserService
 */
public interface UserService {

    UserDto createUser(UserDto userDetails);
    
}