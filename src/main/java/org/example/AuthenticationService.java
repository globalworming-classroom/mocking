package org.example;

public interface AuthenticationService {
    RealKey getKey(String user);

    boolean isValid(RealKey key);
}
