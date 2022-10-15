package com.example.graphqlexample;

import com.example.graphqlexample.domain.Playlist;
import com.example.graphqlexample.domain.User;
import com.example.graphqlexample.repository.PlaylistsRepository;
import com.example.graphqlexample.repository.UsersRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlExampleApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(UsersRepository usersRepository, PlaylistsRepository playlistsRepository) {
        return args -> {
            User user1 = new User("1", "user1", "email1", "p", List.of());
            User user2 = new User("2", "user2", "email1", "p", List.of());
            User user3 = new User("3", "user3", "email1", "p", List.of());
            User user4 = new User("4", "user4", "email1", "p", List.of());
            User user5 = new User("5", "user5", "email1", "p", List.of());
            User user6 = new User("6", "user6", "email1", "p", List.of());

            Playlist playlist1 = new Playlist("1", "playlist1", user1);
            Playlist playlist2 = new Playlist("2", "playlist2", user1);
            Playlist playlist3 = new Playlist("3", "playlist3", user3);
            Playlist playlist4 = new Playlist("4", "playlist4", user4);
            Playlist playlist5 = new Playlist("5", "playlist5", user5);
            Playlist playlist6 = new Playlist("6", "playlist6", user6);

            Stream.of(user1, user2, user3, user4, user5, user6).forEach(usersRepository::save);

            Stream.of(playlist1, playlist2, playlist3, playlist4, playlist5, playlist6).forEach(playlistsRepository::save);

        };
    }

}
