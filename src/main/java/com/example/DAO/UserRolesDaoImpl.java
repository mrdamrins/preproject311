package com.example.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRolesDaoImpl implements UserRolesDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void addUserRoles(Long userId, String userRoles) {
        if (userRoles.equalsIgnoreCase("admin")) {
            Query query = entityManager.createNativeQuery(
                    "insert into user_roles values (?, 2)");
            query.setParameter(1, userId);
            query.executeUpdate();
        }
    }
}
