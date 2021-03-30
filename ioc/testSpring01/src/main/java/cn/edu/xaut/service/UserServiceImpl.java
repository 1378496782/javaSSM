package cn.edu.xaut.service;

import cn.edu.xaut.entity.User;
import cn.edu.xaut.entity.UserDAO;

public class UserServiceImpl implements UserService {

    private User user;
    private UserDAO userDAO;
    
    public UserServiceImpl() {
        
    }

    public UserServiceImpl(User user, UserDAO userDAO) {
        this.user = user;
        this.userDAO = userDAO;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "user=" + user +
                ", userDAO=" + userDAO +
                '}';
    }

    @Override
    public void addUser() {
        System.out.println("Validation");
        System.out.println("Other operations");
        this.userDAO.addUser(this.user);
        System.out.println("Ending");
    }
}
