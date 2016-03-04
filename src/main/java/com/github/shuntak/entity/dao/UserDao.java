package com.github.shuntak.entity.dao;

import com.github.shuntak.entity.User;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class UserDao extends AbstractDAO<User> {
    public UserDao(SessionFactory factory) {
        super(factory);
    }
}
