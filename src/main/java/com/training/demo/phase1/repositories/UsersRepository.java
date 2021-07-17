package com.training.demo.phase1.repositories;
import com.training.demo.phase1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    
}
