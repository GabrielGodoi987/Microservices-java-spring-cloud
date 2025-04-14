package com.gabrielgodoi.userapi.test;

import com.gabrielgodoi.userapi.domain.User;
import com.gabrielgodoi.userapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
@Profile("test")
public class InstantiationConfig implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // instancia de x usuários
        User u1 = new User(null, "Alice Johnson", "alice@example.com", "123456", 50.0);
        User u2 = new User(null, "Bob Smith", "bob@example.com", "abcdef", 60.0);
        User u3 = new User(null, "Charlie Davis", "charlie@example.com", "pass123", 55.0);
        User u4 = new User(null, "Diana Miller", "diana@example.com", "qwerty", 65.0);
        User u5 = new User(null, "Ethan Brown", "ethan@example.com", "ethan123", 70.0);
        User u6 = new User(null, "Fiona Wilson", "fiona@example.com", "fiona123", 45.0);
        User u7 = new User(null, "George Clark", "george@example.com", "georgepw", 80.0);
        User u8 = new User(null, "Hannah Moore", "hannah@example.com", "hannahpw", 75.0);
        User u9 = new User(null, "Ian Walker", "ian@example.com", "ianpass", 58.0);
        User u10 = new User(null, "Julia White", "julia@example.com", "julia456", 62.0);

        this.userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
    }
}
