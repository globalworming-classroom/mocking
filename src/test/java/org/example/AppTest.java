package org.example;

import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void whenUsingRealApplication() throws NoPermissionException {
        RealDatabase database = new RealDatabase();
        AuthenticationService auth = new AllowsAllAuthentication();
        App app = new App(database, auth);
        RealKey key = app.authenticate("admin");
        assertEquals(1, app.getToDos(key).size());

    }

}
