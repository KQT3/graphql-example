package com.example.graphqlexample.repository;

import com.example.graphqlexample.domain.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistsRepository extends JpaRepository<Playlist, String> {
}
