package com.vladimirpandurov.paginationApp7B.service;

import com.vladimirpandurov.paginationApp7B.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
