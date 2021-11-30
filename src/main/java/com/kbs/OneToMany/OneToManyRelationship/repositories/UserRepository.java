package com.kbs.OneToMany.OneToManyRelationship.repositories;

import com.kbs.OneToMany.OneToManyRelationship.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
