package com.ducthang._footbank.service.itf;

import com.ducthang._footbank.dto.UserDTO;
import com.ducthang._footbank.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public UserDTO createUser(UserDTO user);
    public boolean deleteUser(User user);
}