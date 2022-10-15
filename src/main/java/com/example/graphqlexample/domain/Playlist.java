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
public class Playlist {
    @Id
    String id;
    String name;

    @ManyToOne
    @JoinColumn
    User user;
}
