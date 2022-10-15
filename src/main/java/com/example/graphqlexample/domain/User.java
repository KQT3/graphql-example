package com.example.graphqlexample.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id private String id;
    String name;
    String email;
    String password;

    @OneToMany
    List<Playlist> playlists;
}
