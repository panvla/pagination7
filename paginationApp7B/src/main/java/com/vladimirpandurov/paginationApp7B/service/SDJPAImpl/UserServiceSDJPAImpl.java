package com.vladimirpandurov.paginationApp7B.service.SDJPAImpl;

import com.vladimirpandurov.paginationApp7B.domain.User;
import com.vladimirpandurov.paginationApp7B.repository.UserRepository;
import com.vladimirpandurov.paginationApp7B.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceSDJPAImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {} of size {}", page, size);
        return userRepository.findByNameContaining(name, PageRequest.of(page, size));
    }
}
