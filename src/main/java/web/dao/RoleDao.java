package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDao {
    public Role getRoleById (Long id);
    public List<Role> listRoles();
}
