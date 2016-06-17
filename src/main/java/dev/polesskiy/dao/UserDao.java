package dev.polesskiy.dao;

import com.mongodb.MongoClient;
import dev.polesskiy.entity.User;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.stereotype.Repository;

//@Repository
public class UserDao extends BasicDAO<User, String>{
    public UserDao(Class<User> entityClass, MongoClient mongoClient, Morphia morphia, String dbName) {
        super(entityClass, mongoClient, morphia, dbName);
    }
}
