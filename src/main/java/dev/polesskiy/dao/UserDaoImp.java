package dev.polesskiy.dao;

import com.mongodb.MongoClient;
import dev.polesskiy.entity.User;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class UserDaoImp extends BasicDAO<User, String> implements UserDao {
    public UserDaoImp(Class<User> entityClass, MongoClient mongoClient, Morphia morphia, String dbName) {
        super(entityClass, mongoClient, morphia, dbName);
    }
}
