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

        User sinatra = new User("Sinatra");
        userRepository.save(sinatra);

        Folder week1 = new Folder("Week1", jim);
        folderRepository.save(week1);

        Folder week2 = new Folder("Week2", jim);
        folderRepository.save(week2);

        Folder guitar1 = new Folder("guitar1", bob);
        folderRepository.save(guitar1);

        Folder guitar2 = new Folder("guitar2", bob);
        folderRepository.save(guitar2);

        File css = new File("cssPractice",".css", 3.2, week1);
        fileRepository.save(css);

        File html = new File("htmlPractice",".html", 2.1, week2);
        fileRepository.save(html);

        File practiceChords = new File("practiceChords",".dox", 1.1, guitar1);
        fileRepository.save(practiceChords);

        File newSong = new File("newSong",".xml", 12, guitar2);
        fileRepository.save(newSong);

        File newSong1 = new File("newSong1",".xml", 12, guitar2);
        fileRepository.save(newSong1);



    }
}
