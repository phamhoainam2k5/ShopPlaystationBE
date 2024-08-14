package com.hnam.shopplaystation.service;

import com.hnam.shopplaystation.dto.UserDTO;
import com.hnam.shopplaystation.entity.User;

public interface IUserService {

    User registerUser(UserDTO user);

    User loginUser(String email, String password);
}
