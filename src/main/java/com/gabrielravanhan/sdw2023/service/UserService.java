package com.gabrielravanhan.sdw2023.service;

import com.gabrielravanhan.sdw2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
