package com.hnam.shopplaystation.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnam.shopplaystation.dto.UserDTO;
import com.hnam.shopplaystation.entity.Role;
import com.hnam.shopplaystation.entity.User;
import com.hnam.shopplaystation.repository.IRoleRepository;
import com.hnam.shopplaystation.repository.IUserRepository;
import com.hnam.shopplaystation.service.IUserService;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public User registerUser(UserDTO userDTO) {
        Role role = roleRepository.findById(2L).orElseThrow(() -> new RuntimeException("Role not found"));

        User user = new User();
        user.setName(userDTO.getName());
        user.setPhone(userDTO.getPhone());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword()); // Bạn có thể mã hóa mật khẩu ở đây
        user.setAddress(userDTO.getAddress());
        user.setRole(role);

        return userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Invalid credentials");
    }
}
