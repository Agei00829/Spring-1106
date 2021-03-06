
package com.mycompany.springbase1102.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "singleton")
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public Users findAllUsers() {
        return userDAO.queryUsers();
    }
    
    public Boolean existByName(String name) {
        
        return userDAO.existByName(name);
    }
}
