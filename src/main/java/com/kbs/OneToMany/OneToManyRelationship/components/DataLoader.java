package com.kbs.OneToMany.OneToManyRelationship.components;

import com.kbs.OneToMany.OneToManyRelationship.models.File;
import com.kbs.OneToMany.OneToManyRelationship.models.Folder;
import com.kbs.OneToMany.OneToManyRelationship.models.User;
import com.kbs.OneToMany.OneToManyRelationship.repositories.FileRepository;
import com.kbs.OneToMany.OneToManyRelationship.repositories.FolderRepository;
import com.kbs.OneToMany.OneToManyRelationship.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User jim = new User("Jim");
        userRepository.save(jim);

        User bob = new User("Bob");
        userRepository.save(bob);

        Folder week1 = new Folder("Week1", jim);
        folderRepository.save(week1);

        Folder week2 = new Folder("Week2", jim);
        folderRepository.save(week2);

        File css = new File("cssPractice",".css", 3.2, week1);
        fileRepository.save(css);
    }
}
