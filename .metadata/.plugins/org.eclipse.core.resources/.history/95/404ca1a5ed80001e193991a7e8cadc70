package service;

import model.User;  // Make sure you have this import statement

import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private Map<String, User> userDatabase;

    public AuthenticationService() {
        this.userDatabase = new HashMap<>();
    }

    public void addUser(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    public boolean authenticate(String username, String password) {
        User user = userDatabase.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
