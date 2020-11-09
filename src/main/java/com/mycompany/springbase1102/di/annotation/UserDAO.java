
package com.mycompany.springbase1102.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "singleton")
public class UserDAO {
    @Autowired
    private Users uses;
    
    
    public Users queryUsers() {
        return uses;
    }
    public Boolean existByName(String name) {
        
        return queryUsers().getNames().stream()
                .filter(n -> n.equals(name))
                .findFirst()
                .isPresent();
    }
}
