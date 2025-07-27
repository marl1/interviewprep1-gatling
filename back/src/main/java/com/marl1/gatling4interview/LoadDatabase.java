package com.marl1.gatling4interview;

import com.marl1.gatling4interview.user.entity.User;
import com.marl1.gatling4interview.user.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Getter
@Setter
@Service
public class LoadDatabase {
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    void initDatabase() {
        userRepository.save(new User("Admin1", true));
    }


}
