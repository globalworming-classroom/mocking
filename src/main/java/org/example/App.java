package org.example;


import javax.naming.NoPermissionException;
import java.util.List;

public class App {
    private final RealDatabase database;
    private final AuthenticationService auth;

    public App(RealDatabase database, AuthenticationService auth) {
        this.database = database;
        this.auth = auth;
    }


    public RealKey authenticate(String user) {
        return auth.getKey(user);
    }

    public List<String> getToDos(RealKey key) throws NoPermissionException {
        if (auth.isValid(key)) {
            return database.getToDos(key);
        } else throw new NoPermissionException();
    }
}
