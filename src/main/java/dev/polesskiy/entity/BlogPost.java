package dev.polesskiy.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Serialized;

import java.io.File;
import java.io.Serializable;

/**
 * Blog post entity
 */
@Entity("blog-posts")
public class BlogPost implements Serializable {
    @Id
    private ObjectId id;

    @Reference
    private User author;

    private String title;
    private String text;

    @Serialized
    //will be converted to binary by Morphia
    private File attachedFile;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public File getAttachedFile() {
        return attachedFile;
    }

    public void setAttachedFile(File attachedFile) {
        this.attachedFile = attachedFile;
    }

    @Override
    public String toString() {
        String serializedBlogPost = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            serializedBlogPost = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return serializedBlogPost;
    }
}
