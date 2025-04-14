package com.gabrielgodoi.userapi.services;

import com.gabrielgodoi.userapi.domain.User;
import com.gabrielgodoi.userapi.exceptions.EntityNotFoundException;
import com.gabrielgodoi.userapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User userModel) {
        return this.userRepository.save(userModel);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findOne(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public User update(Long id, User userModel) {
        User user = this.userRepository.getReferenceById(id);
        this.updateData(user, userModel);

        return this.userRepository.save(user);
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }


    public void updateData(User entity, User model) {
        entity.setName(model.getName());
        entity.setEmail(model.getEmail());
        entity.setPassword(model.getPassword());
        entity.setHourlyPrice(model.getHourlyPrice());
    }
}
