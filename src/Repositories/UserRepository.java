package Repositories;

import Entities.Player;
import Entities.User;
import Util.Utils;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    private List<User> playerList = new ArrayList<User>();
    private List<User> adminList = new ArrayList<User>();
    private Object Player;


    public UserRepository() {

    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public String saveUser(User user) {

        if (!Utils.isPlayer(user)) {
            try {
                adminList.add(user);
            } catch (Exception e) {
                return String.format("Não foi possivel cadastrar o %s", user.getName());
            }

            return String.format("Administrador %s cadastrado com sucesso!", user.getName());
        } else {
            try {
                playerList.add(user);
            } catch (Exception e) {
                return String.format("Não foi possivel cadastrar o %s", user.getName());
            }

            return String.format("Jogadador %s cadastrado com sucesso!", user.getName());
        }
    }


    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }
}