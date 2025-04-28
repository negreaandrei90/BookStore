package com.neontodo.BookStore_API.repositories;

import com.neontodo.BookStore_API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
