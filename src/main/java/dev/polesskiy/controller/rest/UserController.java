package dev.polesskiy.controller.rest;

import dev.polesskiy.entity.User;
import dev.polesskiy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collection;

/**
 * REST User controller
 */
@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * Retrieve all users.
     *
     * @return all users in JSON and/or HTTP status
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<User>> listAllUsers() {
        Collection<User> users = userService.getAll();
        if (!users.isEmpty()) {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
