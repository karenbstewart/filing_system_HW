package com.kbs.OneToMany.OneToManyRelationship.repositories;

import com.kbs.OneToMany.OneToManyRelationship.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository <Folder,Long> {
}
