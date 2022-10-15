package com.example.graphqlexample.views;

import com.example.graphqlexample.domain.Playlist;
import com.example.graphqlexample.domain.User;
import lombok.Value;

import java.util.List;

@Value
public class View {
    String name;
    List<User> users;
    List<Playlist> playlists;
}
