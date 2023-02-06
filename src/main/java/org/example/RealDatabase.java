package org.example;

import java.util.List;

public class RealDatabase {

    List<String> data = List.of("feed the cat");

    public List<String> getToDos(RealKey key) {
        Util.delay();
        return data;
    }
}
