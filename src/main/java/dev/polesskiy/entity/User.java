package dev.polesskiy.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * User entity
 */
@Document
public class User implements Serializable {
    @Id
    private ObjectId id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isBlocked;
    private boolean isConfirmed;

    @Reference
    private List<BlogPost> blogPosts;

    /**
     * Before saving.
     * <p>
     * Hash password.
     * Set user as confirmed (stub)
     */
    void prePersist() {
        //TODO hash passswrod field
        this.password = this.password;
        this.isConfirmed = true;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(List<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }

    @Override
    public String toString() {
        String serializedUser = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            serializedUser = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return serializedUser;
    }
}
