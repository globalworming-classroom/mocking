package org.example;

import java.util.Objects;
import java.util.UUID;

public class RealKey {
    private final UUID uuid;

    public RealKey(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RealKey realKey = (RealKey) o;

        return Objects.equals(uuid, realKey.uuid);
    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }
}
