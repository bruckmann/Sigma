package Repositories;

import java.util.List;
import Entities.User;

public interface IUserRepository {

    public List<User> getAdmins();
    public List<User>getPlayers();
    public String saveUser(User user);
    public String deletePlayer(int id);
    public String deleteAdmin(int id);
    public String updateUser(User user);

}
