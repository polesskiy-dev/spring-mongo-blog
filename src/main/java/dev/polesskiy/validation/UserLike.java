package dev.polesskiy.validation;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

@Entity
public class UserLike {
    @Id
    ObjectId id;
    //@Email String email;
}
