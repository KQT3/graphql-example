package com.example.graphqlexample.service;

import com.example.graphqlexample.domain.Playlist;
import com.example.graphqlexample.domain.User;
import com.example.graphqlexample.repository.PlaylistsRepository;
import com.example.graphqlexample.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;
    private final PlaylistsRepository playlistsRepository;


    public List<User> allUsers(){
        return usersRepository.findAll();
    }

    public List<Playlist> allPlaylists(){
        return playlistsRepository.findAll();
    }
}
