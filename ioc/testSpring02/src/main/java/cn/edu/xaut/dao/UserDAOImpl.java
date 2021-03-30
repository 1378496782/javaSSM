package cn.edu.xaut.dao;

import cn.edu.xaut.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void addUser(User user) {
        String sql = "insert into user values(null, ?, ?)";
        Object param1[] = {user.getUsername(), user.getPassword()};
        jdbcTemplate.update(sql, param1);
    }
}
