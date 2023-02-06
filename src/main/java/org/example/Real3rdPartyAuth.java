package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Real3rdPartyAuth implements AuthenticationService {

    private final List<RealKey> keys = new ArrayList<>();
    @Override
    public RealKey getKey(String user) {
        Util.delay();
        RealKey key = new RealKey(UUID.randomUUID());
        keys.add(key);
        return key;
    }

    @Override
    public boolean isValid(RealKey key) {
        Util.delay();
        return keys.contains(key);
    }
}
