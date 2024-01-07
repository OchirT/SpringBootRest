package ru.netology.repository;

import ru.netology.model.User;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private static Map<User,List<Authorities>> map;

    public UserRepository() {
        map = new ConcurrentHashMap<>();
        map.put(new User("Misha", "1234"), List.of(Authorities.DELETE,Authorities.READ,Authorities.WRITE));
        map.put(new User("Ivan", "4321"), List.of(Authorities.WRITE));
    }
    public List<Authorities> getUserAuthorities(String user, String password) {
        return map.get(new User(user,password));
    }
}
