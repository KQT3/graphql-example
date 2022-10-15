package com.example.graphqlexample.controller;

import com.example.graphqlexample.domain.User;
import com.example.graphqlexample.service.UserService;
import com.example.graphqlexample.views.View;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    UserService userService;

    @QueryMapping
    public List<User> allUsers() {
        return userService.allUsers();
    }

    @QueryMapping
    public View getView() {
        var users =  userService.allUsers();
        var playlists =  userService.allPlaylists();
        return new View("view1", users, playlists);
    }




//    @MutationMapping
//    public Vehicle addVehicle(@Argument String vin,
//                              @Argument Integer year,
//                              @Argument String make,
//                              @Argument String model,
//                              @Argument String trim,
//                              @Argument Location location) {
//        return this.inventoryService.addVehicle(vin, year, make, model, trim, location);
//    }
}