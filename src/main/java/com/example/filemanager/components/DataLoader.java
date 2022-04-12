package com.example.filemanager.components;

import com.example.filemanager.models.User;
import com.example.filemanager.repositories.FileRepository;
import com.example.filemanager.repositories.FolderRepository;
import com.example.filemanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) {

        User steph = new User("Steph" );
        userRepository.save(steph);

        User dio = new User("Dio");
        userRepository.save(dio);

        User rachel = new User("Rachel");
        userRepository.save(rachel);

    }
}
