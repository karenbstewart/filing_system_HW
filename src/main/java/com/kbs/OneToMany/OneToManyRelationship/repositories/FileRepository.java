package com.kbs.OneToMany.OneToManyRelationship.repositories;

import com.kbs.OneToMany.OneToManyRelationship.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
