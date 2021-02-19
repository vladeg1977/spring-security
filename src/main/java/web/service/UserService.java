package web.service;

import web.model.Role;
import web.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public List<User> listUsers();
    public void updateUser(User user);
    public void deleteUser(Long id);
    public User getUserById(Long id);
    public User getUserByLogin(String login);
    public Role getRoleById (Long id);
    public List<Role> listRoles();
}
