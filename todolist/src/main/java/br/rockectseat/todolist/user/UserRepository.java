package br.rockectseat.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// <> Indica que a classe recebe um generator
public interface UserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
