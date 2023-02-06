package org.example;

import java.util.UUID;

public class AllowsAllAuthentication implements AuthenticationService{

    @Override
    public RealKey getKey(String user) {
        return new RealKey(UUID.randomUUID());
    }

    @Override
    public boolean isValid(RealKey key) {
        return true;
    }
}
