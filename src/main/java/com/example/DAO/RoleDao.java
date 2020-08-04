package com.example.DAO;

import com.example.model.Role;
import java.util.List;

public interface RoleDao {
    Role findByRole(String role);
    Role findByRole(Long id);
    List<Role> getAllRoles();
}
